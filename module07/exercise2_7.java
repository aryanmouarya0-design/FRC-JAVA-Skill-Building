package module07;

import java.util.Scanner;

public class exercise2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temperature : ");
        float temp = sc.nextFloat();
        String condition = (temp < 15) ? "cold" : (temp > 30) ? "hot" : "warm";
        System.out.print(condition);
        sc.close();
    }
}
