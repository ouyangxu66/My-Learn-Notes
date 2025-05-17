package module19.b_genericity;

public class Demo02Genericity {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("22");
        list1.add("99");
        list1.add("33");
        String s=list1.get(2);
        System.out.println(s);
        System.out.println(list1);//直接输出变量名,默认调用toString
    }
}
