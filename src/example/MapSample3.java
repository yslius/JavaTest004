package example;

import java.util.HashMap;
import java.util.Map;

public class MapSample3 {

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>(); // HashMapクラスのインスタンスを生成

		Pet pet1 = new Cat(); // Catクラスのインスタンスを生成
		Pet pet2 = new Dog(); // Dogクラスのインスタンスを生成

		// Mapに要素を追加
		petMap.put("佐藤さん", pet1);
		petMap.put("鈴木さん", pet2);
		petMap.put("田中さん", new Cat());

		// 以下は、コンパイルエラーになる
		// 拡張for文の :の後ろにMapを指定することはできない
		//for(Pet pet : petMap) {
		//    // ・・・
		//}

		// Mapの格納された内容を繰り返し文を使う方法
		for (String key : petMap.keySet()) {
			System.out.println();
			System.out.println("--- Mapから取り出した" + key + "のペットに、ご飯をあげます ---");
			Pet petFromMap = petMap.get(key);
			petFromMap.eat();
		}
	}

}
