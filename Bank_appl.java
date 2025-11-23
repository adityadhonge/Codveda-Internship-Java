import java.util.ArrayList;
import java.util.Scanner;

class Account {
    
    
    
    private String holder_name;
    
    private int current_balance ;
    
    public void set_currentB(Scanner Scan) {
        
        System.out.println("Set your account balance");
        
        int set_b= Scan.nextInt();
        
        this.current_balance = set_b;
        
    }
    
    public void set_holderN(Scanner Scan) {
        try{
            
            System.out.println("Set account holder's name");
            Scan.nextLine();
            String name=Scan.nextLine();
            
            this.holder_name =name ;
            
            
        }catch(Exception o1){
            
            System.out.println("Invalid input");
            System.out.println(o1.getMessage());
        }
        
    }
    
    
    
    public String  toString(){
        
        
        return "name of account holder is :"+" "+holder_name+" "+" and balance is "+" "+current_balance;
    }
    
    
    void add_Amount(Scanner Scan){
        int deposite;
        System.out.println("Enter amount to Deposite:");
        
        deposite=Scan.nextInt();
        current_balance=current_balance+deposite;
        
        System.out.println("deposited succesfully of : "+deposite);
    
        System.out.println("Current balance of -->"+holder_name+" "+"is :"+" "+current_balance);
        
        
        
    }
    
    void  with_Amount(Scanner Scan ){
        
        int withdraw;
    
        System.out.println("Enter amount to Withdraw:");
    
        withdraw=Scan.nextInt();
    
        if(withdraw<=current_balance){
    
            current_balance=current_balance-withdraw;
    
            System.out.println("Withdrawal of "+" "+withdraw+" "+"is succesful");
    
    
    
            
        }
        else{
    
            System.out.println("insuffiecient balance , cureent balance is "+current_balance);
        }
    
    
    
    
    }
    void set_message(){
        System.out.println("------------------------");
        System.out.println("Enter 1 for add amount");
        
        System.out.println("Enter 2 for withdraw an amount");
        System.out.println("Enter 3 for view account details");
        System.out.println("Enter 4 for Exit");
        System.out.println("Enter 5 for Resubmit bank details");
        System.out.println("------------------------");
    }
    
    public Account(int current_balance, String holder_name){

        this.current_balance=current_balance;
        this.holder_name=holder_name;
        
    }


}

    

    


public class Bank_appl{
    
    public static void main(String[] args){
        
        Account a1= new Account(5000, "aditya");

        
        
        
        Scanner Scan= new Scanner(System.in);

        
        
        System.out.println("Welcome to Bank application");
        System.out.println("-------------");

        
        
        int num=0;
        
        do{

            a1.set_message();
            
            int choice=Scan.nextInt();

            
            switch(choice){
    
                case 1:
                a1.add_Amount(Scan);
                    break;
                case 2:
                a1.with_Amount(Scan);
                    break ;
                case 3:
                    System.out.println(a1);  
                    break;

                case 4:
                    num=4;  
                    break ;  

                case 5:
                    System.out.println("Submit details :");
                    a1.set_currentB(Scan);
                    a1.set_holderN(Scan);    
                    System.out.println("submited succesfully:");
                    System.out.println("----------");
                    break;
                default:
                    System.out.println("sorry !,enter correct input");
                            
                    
                    
    
    
            }
        }    
        
        while (num!=4) ;
            
        
        




    }

}
