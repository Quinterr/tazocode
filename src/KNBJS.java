import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KNBJS {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Камень", "Ножницы", "Бумага", "Ящерица", "Спок"};
        boolean toggle = false;
        int b, c;
        String a;
        int[][] rules = {
                {0, 1}, {0, 3},
                {1, 2}, {1, 3},
                {2, 0}, {2, 4},
                {3, 2}, {3, 4},
                {4, 0}, {4, 1}
        };

        System.out.println("Вы хотите начать игру? д/н");
        if (scanner.next().equalsIgnoreCase("д")){
            toggle = true;
            while (toggle) {
                System.out.println("Выберете и впишите предмет: Камень-Ножницы-Бумага-Ящерица-Спок");
                a = scanner.next();
                b = random.nextInt(0, 5);
                c = Arrays.asList(options).indexOf(a);

                System.out.println(a + " x " + options[b]);

                if (b == c) {
                    System.out.println("Ничья!");
                } else {
                    boolean playerWins = false;
                    for (int[] rule : rules) {
                        if (rule[0] == c && rule[1] == b) {
                            playerWins = true;
                            break;
                        }
                    }
                    if (playerWins) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Вы проиграли.");
                    }
                }

                System.out.println("Вы хотите продолжить? д/н");
                if (scanner.next().equalsIgnoreCase("н")){
                    toggle = false;
                    System.out.println("Спасибо за игру!");
                }
            }
        }
    }
}
