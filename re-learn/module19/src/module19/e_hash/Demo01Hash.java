package module19.e_hash;

public class Demo01Hash {
    public static void main(String[] args) {
        Person p1 = new Person("oyx",20);
        Person p2 = new Person("ggb",32);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
//        System.out.println(Integer.toHexString(p1.hashCode()));输出的值为p1的地址值
//        System.out.println(Integer.toHexString(p2.hashCode()));输出的值为p2的地址值
        String s1="ABC的";
        System.out.println(s1.hashCode());

    }
}
