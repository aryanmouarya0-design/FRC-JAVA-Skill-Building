package module05;

public class exercise2_5 {
    public static void main(String[] args) {
        float CP1 = 1000;
        float lossRate = 0.10f;
        float loss1 = lossRate * CP1;
        float SP1 = CP1 - loss1;

        float CP2 = 1000;
        float profitRate = 0.20f;
        float profit = profitRate * CP2;
        float SP2 = CP2 + profit;

        float CPnet = CP1 + CP2;
        float SPnet = SP1 + SP2;
        float profitnet = SPnet - CPnet;
        System.out.printf("net profit is : %f\n", profitnet);
    }
}
