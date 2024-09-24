import java.util.Random;
import java.util.Scanner;

public class GAN {
    public void play() {
        Random rn = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean toggle;
        int a, b, i;

        System.out.println("Вы хотите начать игру? д/н");
        if (scanner.next().equalsIgnoreCase("д")) {
            toggle = true;

            while (toggle) {
                a = rn.nextInt(0,101);
                i = 7;
                System.out.println("Я загадал число от 0 до 100. Попробуй его отгадать");

                while (i != 0) {
                    System.out.println("Осталось попыток: " + i);
                    i--;

                    b = scanner.nextInt();
                    if (a < b) {
                        System.out.println("Я загадал число меньше!");
                    } else if (a > b) {
                        System.out.println("Я загадал число больше!");
                    } else {
                        System.out.println("Ты угадал!");
                        i = 0;
                    }
                }

                System.out.println("Вы хотите продолжить? д/н");
                if (scanner.next().equalsIgnoreCase("н")) {
                    toggle = false;
                    System.out.println("Спасибо за игру!");
                }
            }
        }
    }
}