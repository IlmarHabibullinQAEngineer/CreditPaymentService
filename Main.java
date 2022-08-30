public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int sum = 1_000_000;
        double percent = 9.99;
        int year_one = 1;
        int year_two = 2;
        int year_three = 3;

        //Срок 1 год.
        double index_one = service.calculate(sum, percent, year_one);

        System.out.println("Сумма кредита: " + sum + " ₽");
        System.out.println("Процентная ставка: " + percent + "%");
        if (year_one<= 1) {
            System.out.println("Срок кредита: " + year_one + " год");
        } else {
            System.out.println("Срок кредита: " + year_one + " года");
        }
        System.out.println("Ежемесячный платеж: " + (int) index_one + " ₽");
        System.out.println("________________________");


        //Срок 2 года.
        double index_two = service.calculate(sum, percent, year_two);

        System.out.println("Сумма кредита: " + sum + " ₽");
        System.out.println("Процентная ставка: " + percent + "%");
        if (year_two <= 1) {
            System.out.println("Срок кредита: " + year_two + " год");
        } else {
            System.out.println("Срок кредита: " + year_two + " года");
        }
        System.out.println("Ежемесячный платеж: " + (int) index_two + " ₽");
        System.out.println("________________________");

        //Срок 3 года.
        double index_three = service.calculate(sum, percent, year_three);

        System.out.println("Сумма кредита: " + sum + " ₽");
        System.out.println("Процентная ставка: " + percent + "%");
        if (year_three <= 1) {
            System.out.println("Срок кредита: " + year_three + " год");
        } else {
            System.out.println("Срок кредита: " + year_three + " года");
        }
        System.out.println("Ежемесячный платеж: " + (int) index_three + " ₽");




    }
}
