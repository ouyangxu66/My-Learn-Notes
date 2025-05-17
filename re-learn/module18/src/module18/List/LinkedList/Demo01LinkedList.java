package module18.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.addFirst("11");
        list.addLast("99");
        System.out.println(list.size());
        System.out.println(list);
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
