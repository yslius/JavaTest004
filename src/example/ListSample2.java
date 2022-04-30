package example;

import java.util.ArrayList;
import java.util.List;

public class ListSample2 {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        Cat tama = new Cat();
        Cat mike = new Cat();
        catList.add(tama);
        catList.add(mike);

        Cat cat1 = catList.get(0);
        Cat cat2 = catList.get(1);

        System.out.println();
        System.out.println("----- Listから取り出した先頭のCat型のインスタンスのメソッドを呼び出す -----");
        cat1.eat();
        cat1.playToy();
        System.out.println("----- Listから取り出した2件目のCat型のインスタンスのメソッドを呼び出す -----");
        cat2.eat();
        cat2.playToy();
    }
}