package example;

public class StringSample {
    public static void main(String[] args) {
        String str1 = "123";
        System.out.println("str1 = " + str1);
        System.out.println("str1.length() → " + str1.length());

        System.out.println("--------------------");
        String str2 = "あいう";
        System.out.println("str2 = " + str2);
        System.out.println("str2.length() → " + str2.length());

        System.out.println("--------------------");
        String str3 = "ABCdef";
        System.out.println("str3 = " + str3);

        String str3ToLower = str3.toLowerCase();
        System.out.println("str3.toLowerCase() → " + str3ToLower);

        System.out.println("--------------------");
        String str4 = "ABCdef123ＡＢＣｄｅｆ";
        System.out.println("str4 = " + str4);

        String str4ToLower = str4.toLowerCase();
        System.out.println("str4.toLowerCase() → " + str4ToLower);

        System.out.println("--------------------");
        String str3ToUpper = str3.toUpperCase();
        System.out.println("str3.toUpperCase() → " + str3ToUpper);

        String str4ToUpper = str4.toUpperCase();
        System.out.println("str4.toUpperCase() → " + str4ToUpper);
    }
}
