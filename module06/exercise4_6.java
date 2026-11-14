package module06;

public class exercise4_6 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 10;
        int num3 = 8;

        int sq1 = num1 * num1;
        int sq2 = num2 * num2;
        int sq3 = num3 * num3;

        boolean isPythagorean = (sq1 + sq2 == sq3) || (sq1 + sq3 == sq2) || (sq2 + sq3 == sq1);
        String pytriplet = isPythagorean ? "these are a Pythagorean triplet" : "these are not a Pythagorean triplet";
        System.out.println(pytriplet);
    }
}
