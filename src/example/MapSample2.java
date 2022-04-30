package example;

import java.util.HashMap;
import java.util.Map;

public class MapSample2 {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();

        Pet pet1 = new Cat();
        Pet pet2 = new Dog();

        petMap.put("佐藤さん", pet1);
        petMap.put("鈴木さん", pet2);
        petMap.put("田中さん", new Cat());

        System.out.println();
        System.out.println("--- Mapから取り出した鈴木さんのペットに、ご飯をあげます ---");
        Pet petOwnedBySuzuki = petMap.get("鈴木さん");
        petOwnedBySuzuki.eat();

        System.out.println();
        System.out.println("--- Mapから取り出した田中さんのペットに、ご飯をあげます ---");
        Pet petOwnedByTanaka = petMap.get("田中さん");
        petOwnedByTanaka.eat();

        System.out.println();
        System.out.println("--- Mapから取り出した佐藤さんのペットに、ご飯をあげます ---");
        Pet petOwnedBySato = petMap.get("佐藤さん");

        petOwnedBySato.eat();
    }
}
