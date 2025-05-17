package module18.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(3);
        list.add("a");
        list.add("b");
        list.add("c");
        //使用迭代器遍历
        Iterator<String> iterator =list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*
        * 遍历带有索引集合的快捷键:集合名.fori
        * */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
