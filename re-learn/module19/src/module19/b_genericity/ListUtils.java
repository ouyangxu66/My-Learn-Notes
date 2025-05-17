package module19.b_genericity;


import java.util.ArrayList;

public class ListUtils {
    //自定义一个静态方法addAll,添加多个集合的元素
    public static <E> void addAll(ArrayList<E> list, E...elements) {
        for (E e : elements) {
            list.add(e);
        }
    }
}
