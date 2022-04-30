package example;

import java.util.ArrayList;
import java.util.List;

public class ListLoopSample {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(65);
        numberList.add(80);

        System.out.println();
        System.out.println("--- 拡張for文を使って、リストから要素を取り出す ---");
        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
