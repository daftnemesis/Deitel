import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Program to help students to practice they basic arithmetic knowledge
 */
public class CAI {

    private SecureRandom random = new SecureRandom();
    private Scanner sc = new Scanner(System.in);

    //Method init() initialize the program
    public void init() {

        System.out.println("Pick one kind of exercise");
        System.out.print("1.-Addition\n2.-Subtraction\n3.-Multiplication\n4.-Division\n5.-Random \n?");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                sumMethod();
                break;
            case 2:
                subMethod();
                break;
            case 3:
                multMethod();
                break;
            case 4:
                divMethod();
                break;
            default:
                randomMethod();
                break;
        }
    }


    //Methods goodResponses and badResponses prints different messages depending if the answer is correct or not
    private void goodResponses(){

        int x = 1 + random.nextInt(5);

        switch (x){
            case 1:
                System.out.println("Very good!\n");
                break;
            case 2:
                System.out.println("Excelent!\n");
                break;
            case 3:
                System.out.println("Nice Work!\n");
                break;
            default:
                System.out.println("Keep up the good work!\n");
                break;
        }

    }

    private void badResponses() {

        int x = 1 + random.nextInt(5);

        switch (x){
            case 1:
                System.out.println("No. Please try again.\n");
                break;
            case 2:
                System.out.println("Wrong. Try once more.\n");
                break;
            case 3:
                System.out.println("Don't give up!\n");
                break;
            default:
                System.out.println("No. Keep trying\n");
                break;
        }
    }

    //Method needHelp prints if the student need help from the teacher or not
    private void needHelp(int x){
        if (x < 6)
            System.out.println("Please ask your teacher for extra help.");
        else
            System.out.println("Congratulations, you are ready to go to the next level!.");
    }

    //Set the difficulty of the operations
    private int dificulty(int x){
        return 1 + random.nextInt(x * 10);
    }


    //Multiplication algorithms
    private int mult(int x, int y){
        return x * y;
    }

    private void printMessageMult(int x, int y){
        System.out.printf("How much is %d x %d  ", x, y);
    }

    private void multMethod(){
        int correct = 0;

        System.out.println("Select a difficulty (1 - 100)");
        int difficulty = sc.nextInt();

        int num1 = 1 + dificulty(difficulty);
        int num2 = 1 + dificulty(difficulty);

        int res = 0;

        for (int i = 0; i < 10; i++) {
            printMessageMult(num1, num2);
            res = sc.nextInt();

            if (res == mult(num1, num2)) {
                goodResponses();
                correct++;
            }
            else {
                badResponses();
            }
            num1 = 1 + dificulty(difficulty);
            num2 = 1 + dificulty(difficulty);
        }

        needHelp(correct);
    }

    //Division algorithms

    private int div(int x, int y){
        return x / y;
    }

    private void printMessageDiv(int x, int y){
        System.out.printf("How much is %d / %d  ", x, y);
    }

    private void divMethod(){
        int correct = 0;

        System.out.println("Select a difficulty (1 - 100)");
        int difficulty = sc.nextInt();

        int num1 = 1 + dificulty(difficulty);
        int num2 = (1 + dificulty(difficulty)) / 2;

        int res = 0;

        for (int i = 0; i < 10; i++) {
            printMessageDiv(num1, num2);
            res = sc.nextInt();

            if (res == div(num1, num2)) {
                goodResponses();
                correct++;
            }
            else {
                badResponses();
            }
            num1 = 1 + dificulty(difficulty);
            num2 = 1 + (1 + dificulty(difficulty)) / 2;
        }

        needHelp(correct);
    }

    //Addition algorithms

    private int sum(int x, int y){
        return x + y;
    }

    private void printMessageSum(int x, int y){
        System.out.printf("How much is %d + %d  ", x, y);
    }

    private void sumMethod(){
        int correct = 0;

        System.out.println("Select a difficulty (1 - 100)");
        int difficulty = sc.nextInt();

        int num1 = 1 + dificulty(difficulty);
        int num2 = 1 + dificulty(difficulty);

        int res = 0;

        for (int i = 0; i < 10; i++) {
            printMessageSum(num1, num2);
            res = sc.nextInt();

            if (res == sum(num1, num2)) {
                goodResponses();
                correct++;
            }
            else {
                badResponses();
            }
            num1 = 1 + dificulty(difficulty);
            num2 = 1 + dificulty(difficulty);
        }

        needHelp(correct);
    }

    //Subtraction algorithms

    private int sub(int x, int y){
        return x - y;
    }

    private void printMessageSub(int x, int y){
        System.out.printf("How much is %d - %d  ", x, y);
    }

    private void subMethod(){
        int correct = 0;

        System.out.println("Select a difficulty (1 - 100)");
        int difficulty = sc.nextInt();

        int num1 = 1 + dificulty(difficulty);
        int num2 = 1 + dificulty(difficulty);

        int res = 0;

        for (int i = 0; i < 10; i++) {
            printMessageSub(num1, num2);
            res = sc.nextInt();

            if (res == sub(num1, num2)) {
                goodResponses();
                correct++;
            }
            else {
                badResponses();
            }
            num1 = 1 + dificulty(difficulty);
            num2 = 1 + dificulty(difficulty);
        }

        needHelp(correct);
    }

    //Random operation algorithm

    private void randomMethod(){
        int correct = 0;

        System.out.println("Select a difficulty (1 - 100)");
        int difficulty = sc.nextInt();

        int num1 = 1 + dificulty(difficulty);
        int num2 = 1 + dificulty(difficulty);

        int res = 0;
        int randomCall = 1 + random.nextInt(5);

        for (int i = 0; i < 10; i++){
            switch (randomCall){
                case 1:
                    printMessageSum(num1, num2);
                    res = sc.nextInt();

                    if (res == sum(num1, num2)) {
                        goodResponses();
                        correct++;
                    }
                    else {
                        badResponses();
                    }
                    break;
                case 2:
                    printMessageSub(num1, num2);
                    res = sc.nextInt();

                    if (res == sub(num1, num2)) {
                        goodResponses();
                        correct++;
                    }
                    else {
                        badResponses();
                    }
                    break;
                case 3:
                    printMessageDiv(num1, num2);
                    res = sc.nextInt();

                    if (res == div(num1, num2)) {
                        goodResponses();
                        correct++;
                    }
                    else {
                        badResponses();
                    }
                    break;
                case 4:
                    printMessageMult(num1, num2);
                    res = sc.nextInt();

                    if (res == mult(num1, num2)) {
                        goodResponses();
                        correct++;
                    }
                    else {
                        badResponses();
                    }
                    break;
            }
            num1 = 1 + dificulty(difficulty);
            num2 = 1 + dificulty(difficulty);
            randomCall = 1 + random.nextInt(5);
        }
        needHelp(correct);
    }
}
