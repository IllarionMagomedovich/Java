import java.util.Scanner;

/*Написать программу которая запросит пользователя ввести "Имя" в консоли
Получит введенную строку и выведет в консоль сообзение "Привет, "Имя"! "
 */
public class sem_1 {
        public static void main(String[] args) {
            System.out.println("Введите имя: ");
            Scanner iScanner = new Scanner(System.in, "Cp866");
            String name = iScanner.nextLine();
            System.out.printf("Привет! %s ", name);
        }
}

