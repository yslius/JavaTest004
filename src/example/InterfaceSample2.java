package example;

public class InterfaceSample2 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println("--- pet.eat()を呼び出す[petにはCatクラス型のインスタンスが入っている] ---");
        pet.eat();

        pet = new Dog();

        System.out.println("--- pet.eat()を呼び出す[petにはDogクラス型のインスタンスが入っている] ---");
        pet.eat();
    }
}
