package example;

public class Cat implements Pet {

    @Override
    public void eat() {
        eat("ご飯");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "を食べるよ！おいしいにゃー");
        System.out.println("お腹が一杯になったにゃー");
    }

    @Override
    public void playToy() {
        playToy("おもちゃ");
    }

    @Override
    public void playToy(String toy) {
        System.out.println(toy + "で遊ぶよ。楽しいにゃー");
        System.out.println("遊んでお腹が減ったにゃー");
    }
}
