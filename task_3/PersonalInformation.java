import java.io.FileWriter;
import java.util.Scanner;

public class PersonalInformation {

    private String first_name;
    private String last_name;
    private String middle_name;
    private String year_of_birth;
    private long telephone_number;
    private char gender;
    private final Scanner input = new Scanner(System.in);


    private void Entering_firstName() {
        System.out.println("\nВведите своё Имя: ");
        first_name = input.nextLine();
        if (first_name.equals("")) {
            throw new RuntimeException("Внимание!\nВсе поля дожны быть заполнены!\n");
        }
    }

    private void Entering_lastName() {
        System.out.println("\nВведите свою фамилию: ");
        last_name = input.nextLine();
        if (last_name.equals("")) {
            throw new RuntimeException("Внимание!\nВсе поля дожны быть заполнены!\n");
        }
    }

    private void Entering_middleName() {
        System.out.println("\nВведите своё отчество: ");
        middle_name = input.nextLine();
        if (middle_name.equals("")) {
            throw new RuntimeException("Внимание!\nВсе поля дожны быть заполнены!\n");
        }
    }

    private void Entering_yearOfBirth() {
        System.out.println("\nВведите свой год рождения,\nформат ввода - '01.01.2000': ");
        year_of_birth = input.nextLine();
        if (year_of_birth.equals("")) {
            throw new RuntimeException("Внимание!\nВсе поля дожны быть заполнены!\n");
        }
    }

    private void Entering_telephoneNumber() {
        try {
            System.out.println("\nВведите свой номер телефона,\nформат ввода - '+7ХХХХХХХХХХ': ");
            String phone_number = input.nextLine();
            if (phone_number.equals("")) {
                throw new RuntimeException("Внимание!\nВсе поля дожны быть заполнены!\n");
            }
            telephone_number = Long.parseLong(phone_number);
        } catch (NumberFormatException e) {
            System.out.println("Внимание!\nУбедитесь в правильности ввода номера телефона!\n");
        }
    }

    private void Entering_gender() {
        System.out.println("\nВведите свой пол, выбрав симовол 'f' или 'm':\n(m - это мужской пол, f - это женский пол)");
        
        String male_or_female;
        String female = "f";
        String male = "m";

        male_or_female = input.nextLine();

        if (male_or_female.length() > 1) {
            throw new RuntimeException("Не волнуйтесь и попробуйте снова!");
        }

        if (male_or_female.equals(female) || male_or_female.equals(male)) {
            gender = male_or_female.charAt(0);
        } 
        
        else {
            throw new RuntimeException("Убедитесь в правильности ввода символа!");
        }
        
    }

    
    private void Console_output() {
        System.out.println("\nФамилия \t- \t" + last_name + "\n" + "Имя \t\t- \t" + first_name + "\n" + "Отчество \t- \t" + middle_name + "\n" + "Дата рождения \t- \t" + year_of_birth + "\n" + "Номер телефона \t- \t" + telephone_number + "\n" + "Пол   \t\t- \t" + gender);
    }


    private void Running_methods() {

        Entering_lastName();
        Entering_firstName();
        Entering_middleName();
        Entering_yearOfBirth();
        Entering_telephoneNumber();
        Entering_gender();
        Console_output();

    }

    public void Saving_text_file() {

        Running_methods();

        String text_file = "file/" + last_name + ".txt";

        try (FileWriter file_write = new FileWriter(text_file, true)) {

            file_write.write("<" + first_name + "> " + "<" + last_name + "> " + "<" + middle_name + "> " + "<" + year_of_birth + "> " + "<" + telephone_number + "> " + "<" + gender + ">\n");
        
        } catch (Exception e) {

            System.out.println("Не удачная попытка сохранения данных в текстовый файл");
        }
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getYear_of_birth() {
        return year_of_birth;
    }

    public long getTelephone_number() {
        return telephone_number;
    }

    public char getGender() {
        return gender;
    }
}