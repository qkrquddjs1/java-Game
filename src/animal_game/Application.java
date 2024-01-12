package animal_game;

import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game animal = new Game();
        Animal animal1 = null;


        while (true){
            System.out.println("동물 경주 게임을 시작하겠습니다.");

            System.out.println(" 1. 랜덤 동물을 선택하겠습니다.");
            System.out.println(" 2. 경주를 시작하겠습니다. ");
            System.out.println(" 9. 게임을 종료하겠습니다. ");
            System.out.print(" 선택 : ");


            int animal2 = sc.nextInt();
            switch (animal2){
                case 1 : animal1 = animal.getAnimal(); break;
                case 2 : Game.play(animal1);             break;
                case 9 :
                    System.out.println("게임을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 선택하셧습니다.");
            }

        }


    }

}
