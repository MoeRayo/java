package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]){
        Random random = new Random();
        int gameBoardSpaces = 20;
        int totalSpacesMoved = 0;
        int numberOfRolls = 5;
        int generatedRandomNumber;
        int spacesLeftToMove;


        for (int i = 1; i <= numberOfRolls; i++){
            generatedRandomNumber = random.nextInt(6) + 1;
            totalSpacesMoved = generatedRandomNumber + totalSpacesMoved;
            spacesLeftToMove = Math.max(gameBoardSpaces - totalSpacesMoved, 0);

            if (totalSpacesMoved == gameBoardSpaces ){
                System.out.println("Roll #" + i + " You've rolled a " + generatedRandomNumber + ". You are now on space" + gameBoardSpaces +  " Congrats, you win!");
            } else if (totalSpacesMoved > gameBoardSpaces && i <= numberOfRolls || totalSpacesMoved < gameBoardSpaces && i == numberOfRolls) {
                System.out.println("Roll #" + i + " Game over! You lose!");
            } else {
                System.out.println("Roll #" + i + " You've rolled a " + generatedRandomNumber + ". You are now on space " + totalSpacesMoved + " and have " + spacesLeftToMove + " more to go");

            }

        }
    }

}
