package example;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(65);
        numberList.add(80);

        System.out.println(numberList.get(0));
        System.out.println(numberList.get(1));
        System.out.println(numberList.get(2));

        List<String> petList = new ArrayList<>();

        petList.add("にゃんこ");
        petList.add("わんこ");
        petList.add("ハムスター");

        System.out.println(petList.get(0));
        System.out.println(petList.get(1));
        System.out.println(petList.get(2));
    }
}