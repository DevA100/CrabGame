import java.security.SecureRandom;

public class Crab {
    private static final  SecureRandom randomNumber = new SecureRandom();
    private static final int rat = 2;
    private static final int cat = 3;
    private static final int chisom = 7;
    private static final int amuche = 11;
    private static final int rabbit = 12;

    private enum status{ WON, CONTINUE, LOST};

    public static void main(String[] args){
        status gameStatus;
        int myPoint = 0;
        int sumOfDice = rollDice();

        switch (sumOfDice){
            case chisom :
            case amuche :
                gameStatus = status.WON;
                break;
            case rat:
            case cat:
            case rabbit:
                gameStatus = status.LOST;
                break;
            default:
                gameStatus = status.CONTINUE;
                System.out.printf("Point is: %d%n", myPoint);
                break;



        }

        while(gameStatus ==status.CONTINUE){

            sumOfDice = rollDice();
            if (sumOfDice == myPoint){

                gameStatus = status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = status.LOST;
            }

            if (gameStatus == status.WON){

                System.out.println("Player win!");
            }
            else {
                System.out.println("the player loose!");
            }

        }




    }

    public static int rollDice(){
        int dice1 = 1 + randomNumber.nextInt(6);
        int dice2 = 1 + randomNumber.nextInt(6);

        int sum = dice1 + dice2;

        System.out.printf("Player rolled %d + %d = %d ", dice1, dice2, sum);
        return sum;
    }




}


