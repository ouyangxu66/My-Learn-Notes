package module19.b_genericity;

import java.util.ArrayList;

public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtils.addAll(list1,"12","tt","223");
        System.out.println(list1);
    }
}
