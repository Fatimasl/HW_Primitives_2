public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        float balance = 214.89F;
        float income_sum = 1500F;
        float threshold = 1000F;
        short bonus_price = 18;
        int bonus_sum;
        float total_sum;

        if (income_sum > threshold) {
            bonus_sum = (int) income_sum / bonus_price;
            total_sum = balance + income_sum + bonus_sum;
        } else {
            bonus_sum = 0;
            total_sum = balance + income_sum;
        }

        System.out.println("Ваш баланс равен: "+total_sum);
        System.out.println("В т.ч. бонус: "+bonus_sum);

    }
}
