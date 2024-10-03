public class Main {
    public static void main(String[] args) {
        CreditPaymentService oneTimePay = new CreditPaymentService();
        System.out.println("1 миллион рублей на 1 год под 9.99% годовых");
        System.out.println((int) oneTimePay.calculate(1000000, 12, 9.99));
        System.out.println();
        System.out.println("1 миллион рублей на 2 года под 9.99% годовых");
        System.out.println((int) oneTimePay.calculate(1000000, 24, 9.99));
        System.out.println();
        System.out.println("1 миллион рублей на 3 года под 9.99% годовых");
        System.out.println((int) oneTimePay.calculate(1000000, 36, 9.99));
    }
}
