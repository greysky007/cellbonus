public class Main {
    public static void main(String[] args) {
        int account = 100;//начальная сумма счета
        int payment = 1100;//сумма пополнения
        int minPay = 1000;//необходимая сумма пополнения для получения бонусов
        int sumBonus = 100;//сумма соответсвующая 1 бонусу
        int bonus = (payment / sumBonus);
        int result;

        if (payment >= minPay) {
            result = account + payment + bonus;
            System.out.println("Начислено бонусов: " + (bonus));
        } else {
            result = account + payment;
            System.out.println("Начислено бонусов: 0");

        }
        System.out.println("Итоговый счет: " + result);

    }
}





