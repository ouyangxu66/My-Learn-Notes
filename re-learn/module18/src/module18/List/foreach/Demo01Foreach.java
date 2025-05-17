package module18.List.foreach;

import java.util.ArrayList;

public class Demo01Foreach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("================================");
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
