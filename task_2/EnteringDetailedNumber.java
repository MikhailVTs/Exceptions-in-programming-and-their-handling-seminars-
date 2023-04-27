import java.util.Scanner;

/**
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить
 * к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class EnteringDetailedNumber {

    boolean is_float_entered;
    Scanner input_float = new Scanner(System.in);

    public static void main(String[] args) {

        EnteringDetailedNumber enteringdetailednumber = new EnteringDetailedNumber();

        while (true) {
            System.out.println();

            enteringdetailednumber.float_entered();

            System.out.println();
            try {

                enteringdetailednumber.entering_detailed_number();

            } catch (Exception e) {
                System.out.println("Внимание: Пример правильного ввода - 5,5 или 5");

                enteringdetailednumber.main(args);

            }

        }
    }

    public void float_entered() {

        System.out.print("Введите дробное число (тип float): ");

        if (!input_float.hasNextFloat())

            System.out.println(
                    "\nЭти входные данные не имеют тип float, убедитесь в правильности ввода данных. Буквы и разные символы не проходят валидацию.");

        this.is_float_entered = true;

    }

    public void entering_detailed_number() {

        if (is_float_entered) {

            float number = input_float.nextFloat();

            System.out.println("Вы ввели - " + number);

        }

    }

}