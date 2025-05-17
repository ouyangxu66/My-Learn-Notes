package module19.e_hash;

import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("通话");
        set.add("重地");
        set.add("abc");
        System.out.println(set);//[通话, 重地, abc]
    }
}
