import java.security.SecureRandom;

public class MainCrab {

    private static int dice1;
    private static int dice2;

    private static int sum;


    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();


        dice1 = 1 + randomNumbers.nextInt(6);
        dice2 = 1 + randomNumbers.nextInt(6);

        sum = dice1 + dice2;
        System.out.printf("Player rolled %d + %d = %d ", dice1, dice2, sum);

        boolean breakLoop = true;

        int point = 0;

        switch (sum) {
            case 7:
            case 11:
                System.out.println(Status.WIN.name());
                return;
            case 2:
            case 3:
            case 12:
                System.out.println(Status.LOST.name());
                return;
            default:
                point = sum;

        }


        while (breakLoop) {
            dice1 = 1 + randomNumbers.nextInt(6);
            dice2 = 1 + randomNumbers.nextInt(6);
            sum = dice1 + dice2;
            System.out.printf("Player rolled %d + %d = %d ", dice1, dice2, sum);

            if (sum == point) {
                System.out.println(Status.WIN.name());
                breakLoop = false;
            } else if (sum == 7) {
                System.out.println(Status.LOST.name());
                breakLoop = false;
            } else {
                System.out.println(Status.CONTINUE.name());
            }



        }


    }

}

