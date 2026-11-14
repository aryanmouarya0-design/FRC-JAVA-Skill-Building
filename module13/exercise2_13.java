package module13;

public class exercise2_13 {
    public static String printHeader() {
        return "==========================\n======this is header======\n==========================";
    }

    public static String printBody() {
        return "=======this is body=======";
    }

    public static String printFooter() {
        return "==========================\n======this is footer======\n==========================";
    }

    public static void main(String[] args) {
        System.out.println(printHeader());
        System.out.println(printBody());
        System.out.println(printFooter());
    }
}
