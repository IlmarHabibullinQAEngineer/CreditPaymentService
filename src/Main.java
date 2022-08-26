public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

            int sum = 1_000_000;
            double percent = 9.99;
            int year = 2;
            double index = service.calculate(sum, percent, year);

        System.out.println("Сумма кредита: " + sum + " ₽");
        System.out.println("Процентная ставка: " + percent + "%");
        if (year <= 1){
            System.out.println("Срок кредита: " + year + " год");
        } else {
            System.out.println("Срок кредита: " + year + " года");
        }
        System.out.println("Ежемесячный платеж: " + (int)index + " ₽");
    }
}
