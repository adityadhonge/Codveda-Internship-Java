import java.util.Scanner;

class RecursE {

    int number;

    int result ;

    int Fact(int number) {

        if (number == 0) {
            return 1;
        } else if (number < 0) {
            System.out.println("Factorial is done for only positive numbers ");
            System.out.println("Enter valid positive number only ");
            return -1;
        } else {

            return number * Fact(number - 1);
        }

    }

    void display(int result){

        if(result>0){

            
            System.out.println("Factorial of number is :" + result);
            
        }

    }

    public RecursE() {

        System.out.println("Enter a number to find the factorial");
    }

}

public class RecursionE extends RecursE {

    public static void main(String[] main) {

        RecursionE r1 = new RecursionE();

        Scanner Scan = new Scanner(System.in);

        r1.number = Scan.nextInt();

        r1.result = r1.Fact(r1.number);

        r1.display(r1.result);

        

    }

}
