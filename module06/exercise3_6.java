package module06;

public class exercise3_6 {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 30;
        int num3 = 25;
        String largestnum = (num1 > num2 && num1 > num3) ? "num1 is the largest" : (num2 > num1 && num2 > num3) ? "num2 is the largest" : "num3 is the largest";
        System.out.println(largestnum);
    }
}
