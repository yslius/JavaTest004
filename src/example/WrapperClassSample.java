package example;

public class WrapperClassSample {
    public static void main(String[] args) {
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println("str1 = " + str1);
        System.out.println("Integer.parseInt(str1) → " + i1);

        System.out.println("--------------------");
        String str2 = "-123";
        System.out.println("str2 = " + str2);
        System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2));

        System.out.println("--------------------");
        String str3 = "+123";
        System.out.println("str3 = " + str3);
        System.out.println("Integer.parseInt(str3) = " + Integer.parseInt(str3));

        System.out.println("--------------------");
        String str6 = "10.5";
        double d1 = Double.parseDouble(str6);
        System.out.println("str5 = " + str6);
        System.out.println("Double.parseDouble(str6) → " + d1);
    }
}
