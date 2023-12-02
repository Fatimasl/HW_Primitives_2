public class Main {
    public static void main(String[] args) {

        float balance = 214.89F;
        float incomeSum = 1500F;
        float threshold = 1000F;
        short bonusPrice = 18;
        int bonusSum;
        float totalSum;

        if (incomeSum > threshold) {
            bonusSum = (int) incomeSum / bonusPrice;
            totalSum = balance + incomeSum + bonusSum;
        } else {
            bonusSum = 0;
            totalSum = balance + incomeSum;
        }

        System.out.println("Ваш баланс равен: " + totalSum);
        System.out.println("В т.ч. бонус: " + bonusSum);

    }
}
