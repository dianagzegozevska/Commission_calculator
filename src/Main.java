import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner дозволяє вводити данні прямо в консоль
        Scanner scanner = new Scanner(System.in);

        System.out.println("===калькулятор комісій===");

        //Введення суми платежу
        System.out.print("Введіть суму платежу:");
        BigDecimal amount = scanner.nextBigDecimal();

        //Введення відсотка комісії (наприклад, 2.5)
        System.out.print("Введіть відсоток комісії: ");
        BigDecimal percent = scanner.nextBigDecimal();

        //ЛОГІКА РОЗРАХУНКУ
        //Формула: Сума * (Відсоток / 100)
        BigDecimal percentRate = percent.divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP) ;

        //Розрахунок суми комісії з округленням до двох знаків
        BigDecimal commission = amount.multiply (percentRate).setScale(2,RoundingMode.HALF_UP);

        //Фінальна сума
        BigDecimal finalAmount = amount.add(commission).setScale(2,RoundingMode.HALF_UP);

        //ВИВІД РЕЗУЛЬТАТУ
        System.out.println ("\n---Результат---");
        System.out.println ("Сума комісії: " + commission);
        System.out.println ("Фінальна сума до сплати: "+ finalAmount);
                System.out.println ("--------");}

}