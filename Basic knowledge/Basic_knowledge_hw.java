import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Basic_knowledge_hw {
    public static void main(String[] arg) {

        System.out.println("TASK №1");
        Object[] a = new Object[]{1, 2, "a", "b", "0", "15", 15};       //input
        Object arr = getIntegersFromList(a);
        System.out.println(arr);

        System.out.println("TASK №2");
        String str1 = "sTreSS";                                 //input
        Character chr1 = first_non_repeating_letter(str1);
        System.out.println(chr1);
        String str2 = "ttttttt";                                 //input
        Character chr2 = first_non_repeating_letter(str2);
        System.out.println(chr2);

        System.out.println("TASK №3");
        Integer num = 493193;                                      //input
        int sum = digitalRoot(num);
        System.out.println(sum);

        System.out.println("TASK №4");
        Integer [] arr_n = new Integer[]{1, 3, 6, 2, 2, 0, 4, 5};             //input
        int target = 5;                                                  //input
        int count1 = countPairsFor(arr_n, target);
        System.out.println(count1);
        long count2 = countPairsStream(arr_n, target);
        System.out.println(count2);

        System.out.println("TASK №5");
        String name_surname = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";       //input
        String sort_name = sortedName(name_surname);
        System.out.println(sort_name);

        System.out.println("EXTRA TASK №1");
        Integer numb = 2017;                                        //input
        char[] arr2 = numb.toString().toCharArray();
        int[] arr_num = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++){
            arr_num[i] = Character.getNumericValue(arr2[i]);
        }
        int min_numb[] = findNext(arr_num, arr_num.length);
        String ress = "";
        for(int i:min_numb){
            ress+= i;
        }
        System.out.println(Integer.valueOf(ress));

        System.out.println("EXTRA TASK №2");
        Long h_ip = 2149583361L;                                         //input
        String ip  = ip_address(h_ip);
        System.out.println(ip);

    }

    static Object getIntegersFromList(Object[] mes) {         //TASK №1
        LinkedList<Object> arr = new LinkedList();
        for (Object o : mes) {
            if (o instanceof Integer) {
                arr.add(o);
            }
        }
        return arr;
    }

    static Character first_non_repeating_letter(String str) {                   //TASK №2
        String new_str = str.toLowerCase();
        int index = 0;
        for (Character ch : new_str.toCharArray()) {
            if (new_str.indexOf(ch) == new_str.lastIndexOf(ch)) {
                index = new_str.indexOf(ch);
                return str.charAt(index);
            }

        }
        return ' ';
    }

    static int digitalRoot(Integer num) {                                            //TASK №3
        int sum = 0;
        char[] arr_num = num.toString().toCharArray();
        for (Character d : arr_num) {
            sum += Character.getNumericValue(d);
        }
        if (sum >= 10) {
            return digitalRoot(sum);
        }
        return sum;
    }

    static int countPairsFor(Integer[] arr_n, int target) {                            //TASK №4
        int pairs = 0;
        for (int i = 0; i < arr_n.length; i++) {
            for (int j = i + 1; j < arr_n.length; j++)
                if (arr_n[i] + arr_n[j] == target) {
                    pairs += 1;
                }
        }
        return pairs;
    }

    static long countPairsStream(Integer[] arr_n, int target) {                       //TASK №4
        LinkedList<Object> arr = new LinkedList();
        IntStream.range(0,  arr_n.length)
                .forEach(i -> IntStream.range(0,  arr_n.length)
                        .filter(j -> i != j && arr_n[i]+ arr_n[j]== target)
                        .forEach(j -> arr.add(1)));
        return arr.size()/2;
    }

    static String sortedName(String names) {                                        //TASK №5
        String[] up_names = names.toUpperCase().split(";");
        for (int i = 0; i < up_names.length; i++) {
            String[] a = up_names[i].split(":");
            up_names[i] = a[1] + ", " + a[0];
        }
        Arrays.sort(up_names);
        String res = "";
        for (String s : up_names) {
            res += '(' + s + ')';
        }
        return res;
    }

    static void swap(int ar[], int i, int j) {                                  //Extra TASK №1
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static int[] findNext(int ar[], int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            System.out.println("Not possible");
        } else {
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] > x && ar[j] < ar[min]) {
                    min = j;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, n);
        }
        return ar;
    }

    static String ip_address(Long h_ip){                               //Extra TASK №2
        String ip_2 = Long.toBinaryString(h_ip);
        String res = "";
        for (int i =0; i<ip_2.length();i+=8){
            res += Integer.parseInt((ip_2.substring(i, i+8)), 2) + ".";
        }
        return res.substring(0, res.length()-1);
    }
}
