package technical.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class TestsExpressions {
    public static void main(String[] args) {
        List<Integer[]> list = new ArrayList();
        list.add(new Integer[]{1, 2});
        list.add(new Integer[]{3, 4});
        list.remove(0);
        list.set(0, new Integer[]{1, 2});
        list.add(1, new Integer[]{1, 2});
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Arrays.asList("".split(",")).stream().skip(1).collect(Collectors.toList());
        Collections.sort(list1);
        list1.indexOf(1);
        Set<Integer> set = new HashSet<>();
        int[][] array = new int[2][2];
        int a = array.length;
        int b = array[1].length;
        Set<Integer> membersSet = new HashSet<>();
        membersSet.add(1);
        list2.add(a + "" + b);
        Queue q1 = new LinkedList();
        int[] array1 = {1, 2};
        Arrays.copyOf(array1, 1);
        Arrays.sort(array, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(array1);
        Map<String, Integer> map = new HashMap<>();
        list2.get(0).split(",", 4);
        Queue<Integer> queue = new LinkedList<>();
        queue.poll();
        Collections.sort(list2);
        String str = "abc";
        map.get("a");
        str += 'd';
        System.out.println(str);
        List<String> list3 = new ArrayList<>();
        list3.add("abc");
        for (String c : list3) {
            c += "cde";
        }
        System.out.println(list3);
        Stack<Integer> stack = new Stack<>();
        char ch = '{';
        List<Character> list4 = new ArrayList<>();
        list4.add(ch);
        char c = str.charAt(0);
        List<Integer> linkedList = new LinkedList();
    }


}