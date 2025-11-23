
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class RandomE {

    int random;

    int guess;

    int remaining = 3;

    

    void operation(Scanner Scan) {

        try {

            guess = Scan.nextInt();

            if (guess <= 0) {

                throw new ArithmeticException();
            }
        } catch (Exception e1) {
            System.out.println("Enter valid numbers only");
            remaining=-1;
            
        }

        while (remaining > 0) {

            if (random == guess) {

                System.out.println("Excellent you nailed it , Congrats !");
                System.out.println("Your Guess Correct :  " + random);

                break;
            }

            else {

                remaining--;
                System.out.println("YOU HAVE REMAINING ATTEMPtS : " + remaining);

                if (random < guess) {

                    System.out.println("Your Predicting To High");

                }

                else if (random > guess) {

                    System.out.println("Your Predicting To Low");

                }

                if (remaining > 0) {

                    System.out.println("Guess again : ");

                    try {

                        Scan.nextLine();

                        guess = Scan.nextInt();

                        if (guess <= 0) {

                            throw new ArithmeticException();
                        }
                    } catch (Exception e1) {
                        System.out.println("Enter valid numbers only");
                        remaining=-1;
                        
                    }

                }

            }

        }
        if (remaining==0) {

            System.out.println("Soory you lost ! ");
            System.out.println("Correct number is " + random);
            System.out.println("Try next time ");

        }

    }

    public RandomE() {

        System.out.println("WELCOME TO GUESSING GAME ");
        System.out.println("LETS CHECK YOUR SHARPNESS BY GUESSING NUMBER");
        System.out.println("Guess a number from 0 to 100");

    }

}

public class Guessing {

    public static void main(String[] args) {

        RandomE E1 = new RandomE();

        Random r1 = new Random();
        E1.random = r1.nextInt(0, 101);

        Scanner Scan = new Scanner(System.in);

        E1.operation(Scan);

    }

}
