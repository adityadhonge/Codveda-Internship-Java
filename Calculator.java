import java.util.Scanner;


class CodTask1 {

    double input_1;

    double input_2;

    int choosen_numb;

    double result;

    void setMessage1() {

        System.out.println("ENTER TWO NUMBERS  TO PERFORM OPERATION ");

    }

    void setMessage2() {

        System.out.println("--------------------");
        System.out.println("CHOOSE TYPE OF OPERATION ");

        System.out.println("--------------------");

        System.out.println("ENTER 1 FOR ADDITION");
        System.out.println("ENTER 2 FOR SUBTRACTION");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");

        System.out.println("--------------------");

    }

    void addition(){

        result = input_1 + input_2;
        System.out.println("ADDITION IS  :  " + result);

    }
    void subtraction(){

        result = input_1 - input_2;
        System.out.println("SUBTRACTION IS  :  " + result);
        
    }
    void multiplication(){
        
        result = input_1 * input_2;
    
        System.out.println("MULTIPLICATION IS  :  " + result);
        
    }
    void division(){
        
        
        try {

            
            if(input_2==0){

                throw new ArithmeticException();
            }
    
            result = input_1 / input_2;
            System.out.println("DIVISION IS  :  " + result);
    
        } catch (ArithmeticException e1) {
            System.out.println("enter valid number to divide");
            System.out.println("DONT DIVIDE USING 0");
            System.out.println(e1.getMessage());
        }
    }

    void cal_Operation() {

        
        switch (choosen_numb) {

            case(1): {

                addition();


                break;
            }

            case(2): {

                subtraction();


                break;

            }
            case(3): {

                multiplication();

                break;
            }

            case(4): {

                division();


                break;
            }
            default: {

                System.out.println("CHOOSE CORRECT INPUT");
            }

        }

    }

    public CodTask1() {

        System.out.println("WELCOME TO  CALCULATOR");
    }
}

public class Calculator {

    public static void main(String[] args) {


        CodTask1 c1 = new CodTask1();

        c1.setMessage1();

        Scanner Scan = new Scanner(System.in);

        c1.input_1 = Scan.nextDouble();

        c1.input_2 = Scan.nextDouble();

        c1.setMessage2();

        c1.choosen_numb=Scan.nextInt();

        c1.cal_Operation();

        Scan.close();

        }
    }


