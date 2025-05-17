package module19.a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "n", "a", "c", "d", "k", "s");//添加任意的元素个数
        Collections.sort(list);//按照默认规则将元素排序,即按照ASCII码表
        System.out.println(list);
        Collections.shuffle(list);//打乱集合中的元素排序

    }
}
