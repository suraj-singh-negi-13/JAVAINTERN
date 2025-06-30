/*
Task 5: Bank Account Simulation
Objective: Simulate basic bank operations using Java OOP.
Tools :Java, VS Code, Terminal.
Deliverables: Class-based Java program with transactions.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Account{

    private String name;
    private String accno;
    private String mobno;
    private float amount;
    ArrayList<Account> list=new ArrayList<>();
    private void addCustomer(Scanner sc){
        Account ob=new Account();
        newCust(ob,sc);
        list.add(ob);

    }
    //deposit function is created.....
    private void deposit(Scanner sc){
        amount=sc.nextFloat();
        accno=sc.nextLine();
        for(Account ob:list){
            if((ob.accno).equals(accno) && amount>=1){
                (ob.amount)+=amount;
                System.out.println("Account deposit Successfully...");
                return;
            }
        }
        System.out.println(" wrong account or deposit minimum 1rs amount....");
     }

    //Withdraw function is created.....
    private void withdraw(Scanner sc){
        amount=sc.nextFloat();
        accno=sc.nextLine();
        for(Account ob:list){
            if((ob.accno).equals(accno) && amount>=1 && amount<=ob.amount){
                (ob.amount)-=amount;
                System.out.println("Amount withdraw Successfully....");
                return;
            }
        }
        System.out.println("account not matched or amount not sufficient...");
    }

    // Display the Account amount information .....
    private void displayAmount(Scanner sc){
        accno=sc.nextLine();
        if(!accountExist(accno)){
            System.out.println("Account not exist...");
            return;
        }
        for(Account ob:list){
            if((ob.accno).equals(accno)){
                System.out.println("Name:"+ob.name+"\nbalance amount:"+ob.amount);
                return;
            }
        }
    }
    //check account holder exist or not.....
    private boolean accountExist(String accno){
        for(Account ob:list){
            if((ob.accno).equals(accno)){
                return true;
            }
        }
        return false;
    }
    //new costomer details....
    private void newCust(Account ob,Scanner sc){
        System.out.print("Enter Customer Account number:");
        ob.accno=sc.nextLine();
        sc.nextLine();
        if(accountExist(ob.accno)){
            System.out.println("Account already exist...Retry....");
            newCust(ob,sc);
        }
        System.out.print("Enter Customer name:");
        ob.name=sc.nextLine();
        System.out.print("Enter Customer mobile number:");
        ob.mobno=sc.nextLine();
        System.out.print("Enter Initial Amount:");
        ob.amount=sc.nextFloat();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account ac=new Account();
        int op;
        do{
            System.out.println("************DETAILS*************\n");
            System.out.println("1........ADD NEW CUSTOMER.......");
            System.out.println("2.........DEPOSIT AMOUNT........");
            System.out.println("3.........WITHDRAWL AMOUNT........");
            System.out.println("4.........DISPLAY AMOUNT........");
            System.out.println("5...............EXIT............\n");

            System.out.print("Choose option:");
            op=sc.nextInt();
            switch(op){
                case 1:ac.addCustomer(sc);
                    break;
                case 2:ac.deposit(sc);
                    break;
                case 3:ac.withdraw(sc);
                    break;
                case 4:ac.displayAmount(sc);
                    break;
                case 5:System.exit(0);
                    break;
                default: System.out.println("Choose Correct Option....");
            }
        }while(true);
    }
}