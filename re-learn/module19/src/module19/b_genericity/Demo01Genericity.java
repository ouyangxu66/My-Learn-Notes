package module19.b_genericity;

import java.util.ArrayList;

public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(true);
        arrayList.add("ss");
        for (Object o : arrayList) {
            String s = (String) o;
            System.out.println(o);
        }

    }
}
