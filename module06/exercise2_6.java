package module06;

public class exercise2_6 {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isMember = false;
        boolean hasCoupon = false;
        String discount = (isStudent || isMember || hasCoupon) ? "congratulations you are eligible for discount" : "sorry you are not eligible for discount";
        System.out.println(discount);
    }
}
