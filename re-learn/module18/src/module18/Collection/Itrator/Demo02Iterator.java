package module18.Collection.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Iterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if ("c".equals(s)) {
                list.add("d");
            }
        }
        System.out.println(list);
    }
}
