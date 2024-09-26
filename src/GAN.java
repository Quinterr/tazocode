import java.util.Random;
import java.util.Scanner;

public class GAN {
    public void play() {
        Random rn = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean toggle;
        int a, b, i, z, x, w;

        System.out.println("Вы хотите начать игру? д/н");
        if (scanner.next().equalsIgnoreCase("д")) {
            System.out.println("Выберите режим игры: \n 1 - числа от 0 до 100, 7 попыток\n 2 - числа от 0 до 1000, 10 попыток\n");
            while (true) {
                w = scanner.nextInt();
                if ((w > 2) || (w < 1)){
                    System.out.println("Выберете режим 1 или 2");
                } else {
                    break;
                }
            }

            if (w == 1) {
                z = 101; x = 7;
            } else {
                z = 1001; x = 10;
            }

            toggle = true;
            while (toggle) {
                a = rn.nextInt(0, z);
                i = x;
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