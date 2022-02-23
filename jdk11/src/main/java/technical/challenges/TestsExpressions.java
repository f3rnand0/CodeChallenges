package technical.challenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestsExpressions {
    public static void main(String[] args) {
        //System.out.println(TestsExpressions.caesarCypherEncryptor("xyz", 2));
        System.out.println("AND");
        System.out.println("false && false: " + (false && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("true && true: " + (true && true));
        System.out.println();
        System.out.println("OR");
        System.out.println("false || false: " + (false || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));
        System.out.println(3/2);
        List<Integer[]> list = new ArrayList();
        list.add(new Integer[]{1,2});
        list.remove(2);
        list.set(1, new Integer[]{1,2});
        list.add(1, new Integer[]{1,2});
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collections.sort(list1);
        list1.indexOf(1);
        Set<Integer> set = new HashSet<>();
        int[][] array = new int[2][2];
        int a = array.length;
        int b = array[2].length;
        Arrays.sort(array);
        Set<Integer> membersSet = new HashSet<>();
        membersSet.add(1);
        list2.add(a+""+b);
        Queue q1 = new LinkedList();
        int[] array1 = {1, 2};
        Arrays.copyOf(array1, 1);
        Arrays.sort(array, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(array1);
        Map<String,Integer> map = new HashMap<>();
        map.get();
    }

    public static String longestPalindromicSubstring(String str) {
        char[] array = str.toCharArray();
        List<String> list = new ArrayList<>();
        String largestPalindrome = str.substring(0,0);
        for(int i=0; i < array.length; i++) {
            for(int j=i+1; j < array.length; j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr))
                    list.add(subStr);
            }
        }
        int length=0;
        for(String p : list){
            if (length < p.length()) {
                length = p.length();
                largestPalindrome = p;
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(String str) {
        str.substring(0,1);
        int i=0, j = str.length() - 1;
        if (str.length() == 1)
            return true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
