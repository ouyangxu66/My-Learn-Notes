package module19.c_poker;

import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        //1.创建ArrayList集合->color ->专门存花色
        String[] color = "♠-♥-♣-♦".split("-");
        //2.创建一个ArrayList集合 ->number -> 专门存牌号
        String[] number = "2-3-4-5-6-7-8-9-10-A-J-Q-K".split("-");
        //3.创建一个ArrayList集合->poker ->专门存花色和牌号组合好的牌面
        ArrayList<String> poker = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                String pokerNumber = c + n;
                poker.add(pokerNumber);
            }
        }
        poker.add("☺");
        poker.add("😊");
        //4.打乱poker
        Collections.shuffle(poker);
        //5.创建4个ArrayList集合,分别代表三个玩家,以及存储一个底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //6.如果index为最后三张,往dipai集合中存
        for (int i = 0; i < poker.size(); i++) {
            if (i >=51) {
                dipai.add(poker.get(i));
            } else if (i%3==0) {
                p1.add(poker.get(i));
                //7.如果index%3==0 给p1
            } else if (i%3==1) {
                p2.add(poker.get(i));
                //8.如果index%3==1 给p2
            }else if (i%3==2) {
                p3.add(poker.get(i));
                //9.如果index%3==2 给p3
            }
        }
        //10.遍历看
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dipai);
    }
}
