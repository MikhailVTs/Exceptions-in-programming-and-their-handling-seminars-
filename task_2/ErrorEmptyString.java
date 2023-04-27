/*
 *  2. Разработайте программу, которая выбросит Exception, 
 *  когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
 *  что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class ErrorEmptyString {

    boolean is_text_input;
    Scanner input_string = new Scanner(System.in);
    String text;

    public static void main(String[] args) {

        ErrorEmptyString erroremptystring = new ErrorEmptyString();

        while (true) {

            System.out.println();
            erroremptystring.text_input();
            System.out.println();

            try {

                erroremptystring.empty_string();

            } catch (ErrorEmptyStringException e) {

                System.out.println(e.getMessage());
                erroremptystring.main(args);

            }

        }

    }

    public void text_input() {

        System.out.print("Введите строку: ");

        if (!(text = input_string.nextLine()).isEmpty()) {

            System.out.println("\nВы ввели - " + text);
            this.is_text_input = true;

        }

        else {

            this.is_text_input = false;

        }

    }

    public void empty_string() throws ErrorEmptyStringException {

        if (is_text_input) {

        }

        else {

            throw new ErrorEmptyStringException(
                    "Внимание: Введенной строке отсутствую какие-либо символы (пустая строка).\n");

        }

    }

}
