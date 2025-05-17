package module19.d_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo01HashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("我是");
        set.add("公关部");
        set.add("的");
        set.add("狗");
        set.add("kk");
        set.add("和");
        set.add("警察");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
