public class sumMinMaxArray {
    public static void main(String[] args) {
        double [] money = {1000, 55.55,120.32,20.70,37.11};
        double sum = 0;
        double min = money[0];
        double max = money[0];

        for (double sumOfMoney : money) {
            sum += sumOfMoney;

            if (sumOfMoney> max) max = sumOfMoney;

            if (sumOfMoney <min )min = sumOfMoney;

        }
        System.out.println("The sum is " + sum);
        System.out.println("The minimum amount is " + min + " The maximum amount is " + max);
    }
}
