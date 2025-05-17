package module18.List.LinkedList;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //public E pop():从列表所表示的堆栈处弹出一个元素
        list.pop();
        System.out.println(list);
        //public void push(E e):将此元素推入此列表所表示的堆栈
        list.push("5");
        System.out.println(list);
    }
}
