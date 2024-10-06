public class CreditPaymentService {
    public double calculate(double sumRub, double periodMonth, double percentYear) {
        double percentMonth = percentYear / 100 / 12;
        return sumRub * percentMonth * Math.pow((1 + percentMonth), periodMonth) / (Math.pow((1 + percentMonth), periodMonth) - 1);
    }
}
