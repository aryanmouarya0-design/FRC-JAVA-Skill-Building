package module07;

import java.util.Scanner;

public class exercise3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter cost price : ");
        float cp = sc.nextFloat();
        System.out.print("enter selling price : ");
        float sp = sc.nextFloat();

        if (sp > cp) {
            float profit = sp - cp;
            float profitPercent = (profit / cp) * 100;
            System.out.println("profit incurred \nprofit = " + profit + "\nprofit % = " + profitPercent);
        } else {
            float loss = cp - sp;
            float lossPercent = (loss / cp) * 100;
            System.out.println("loss incurred \nloss = " + loss + "\nloss % = " + lossPercent);
        }
        sc.close();
    }
}
