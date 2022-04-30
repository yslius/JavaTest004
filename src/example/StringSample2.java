package example;

public class StringSample2 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        String str5 = "abcdefghij";
        String str6 = "abc";
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str5.indexOf(str6) → " + str5.indexOf(str6));

        System.out.println("--------------------");
        String str7 = "cde";
        System.out.println("str7 = " + str7);
        System.out.println("str5.indexOf(str7) → " + str5.indexOf(str7));

        System.out.println("--------------------");
        String str8 = "aaa";
        System.out.println("str8 = " + str8);
        System.out.println("str5.indexOf(str8) → " + str5.indexOf(str8));
    }
}
