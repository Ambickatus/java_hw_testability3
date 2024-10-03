public class CreditPaymentService {
    public double calculate(double sumRub, double periodMonth, double percentYear) {
        return sumRub * (percentYear/100/12) * Math.pow((1 + (percentYear/100/12)), periodMonth) / (Math.pow((1 + (percentYear/100/12)), periodMonth) - 1);
    }
}
