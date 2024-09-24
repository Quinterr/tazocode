import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KNBJS knbjs = new KNBJS();
        GAN gan = new GAN();
        Scanner sc = new Scanner(System.in);
        boolean tg = true;

        while (tg){
            System.out.println("\nДобро пожаловать в меню! \nВыберите во что будете играть: \n1 К-Н-Б-Я-С \n2 Угадай число \n \n 0 Выход \n");
            switch (sc.nextInt()) {
                case 0:
                {tg = false;}
                case 1:
                {knbjs.play();}
                case 2:
                {gan.play();}
            }
        }
    }
}