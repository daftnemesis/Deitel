import java.security.SecureRandom;

/**
 *Craps class simulates the dice game craps
 */
public class Craps {

    //secureRandom number generator
    private static final SecureRandom random = new SecureRandom();

    //enum type with constants that represent the game status
    private enum Status { CONTINUE, WON, LOST };

    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    //plays one game of craps
    public static void main(String[] args) {

        int myPoint = 0; //point id no win or loss on first roll
        Status gameStatus; //can contain WIN, CONTINUE OR LOST

        int sumDice = rollDice();// first roll of the dice

        //determine game status and point based on first roll
        switch (sumDice)
        {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        //while game is not complete
        while (gameStatus == Status.CONTINUE)
        {
            sumDice = rollDice();

            if (sumDice == myPoint)
                gameStatus = Status.WON;
            else
                if (sumDice == SEVEN)
                    gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");



    }

    //roll dice, caculate sum and displays results
    public static int rollDice()
    {
        //pick random die values
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        int sum = die1 + die2;

        //diplays results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    }
}
