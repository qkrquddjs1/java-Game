package animal_game;

public class Game {



    public Animal getAnimal(){
        Animal randomAnimal = null;

        int random = (int)(Math.random() * 4);

        switch (random){
            case 0 : randomAnimal = new Cat(); break;
            case 1 : randomAnimal = new Cheethah(); break;
            case 2 : randomAnimal = new Dog(); break;
            case 3 : randomAnimal = new Horse(); break;
        }

        return randomAnimal;

    }


    public static void play(Animal animal) {
        if (animal != null){
            animal.run();
        } else {
            System.out.println("동물을 먼저 골라주세요");
        }

    }


}
