import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите \"слова\" - последовательность строчных латинских букв и цифр");
        String n = in.nextLine();

        if (n.equals(""))
            System.out.println("Введите, пожалуйста, слова! ");
        else {
            String[] words = n.split("\\s+"); //позволяет разбить строку на подстроки по определенному разделителю
            int maxLengthString = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches("[a-z0-9]+")) {

                    for (int k = 0; k < words.length; k++) {
                        if (words[k].length() >= maxLengthString) {
                            maxLengthString = words[k].length();
                        }
                    }
                } else System.out.println("Введите допустимые символы: строчные латинские буквы и арабские цифры!"); break;
            }
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == maxLengthString) {
                    System.out.print(words[j] + " ");
                }
            }
        }
    }
}


