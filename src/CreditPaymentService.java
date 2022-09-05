public class CreditPaymentService {
    public int calculate(int a, double b, int c) {

        //double index = service.calculate(sum, percent, year)

        //Процент в месяц.
        double month = b / 12;
        double inmonth = month / 100;

        //Количество месяцев.
        int months = c * 12;

        //Основной рассчет.

        //Рассчет нинжней строки.
        double stepen = Math.pow(1 + inmonth, months);
        double instepen = stepen - 1;

        //Рассчет верхней строки.
        double upstepen = Math.pow(1 + inmonth, months);
        double upstepens = inmonth * upstepen;

        //Итоговый рассчет.
        double preresult = upstepens / instepen;

        double result = preresult * a;
        return (int) result;

    }
}
