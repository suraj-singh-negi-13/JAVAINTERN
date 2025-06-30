/*
Task 5: Bank Account Simulation
Objective: Simulate basic bank operations using Java OOP.
Tools :Java, VS Code, Terminal.
Deliverables: Class-based Java program with transactions.
 */

public class Account{

    private String name;
    private String accno;
    private String mobno;
    private float amount;
    ArrayList<Account> list=new ArrayList<>();
    private void addCustomer(){
        Account ob=new Account();
        newCust(ob);
        list.add(ob);

    }
    //deposit function is created.....
    private void deposit(float amount,String accno){
        for(Account ob: list){
            if((ob.accno).equals(accno) && amount>=1){
                (ob.amount)+=amount;
                return;
            }
        }
        System.out.println(" deposit minimum amount 1rs");
     }
    //Withdraw function is created.....
    private void withdraw(float amount,String accno){
        for(Account ob: list){
            if((ob.accno).equals(accno) && amount>=1 && amount<=ob.amount){
                (ob.amount)-=amount;
                System.out.println("Amount withdraw Successfully....");
                return;
            }
        }
        System.out.println("account not matched or amount not sufficient...");
    }

    private void displayAmount(String accNo){

    }

    private boolean accountExist(String accno){
        for(Student ob:list){
            if((ob.accno).equals(accno)){
                return true;
            }
        }
        return false;
    }

    private void newCust(Account ob){
        System.out.print("Enter Customer Account number:");
        ob.accno=sc.nextLine();
        if(accountExist(ob.accno)){
            System.out.println("Account already exist...Retry....");
            newCust(ob);
        }
        System.out.print("Enter Customer name:");
        ob.name=sc.nextLine();
        System.out.print("Enter Customer mobile number:");
        ob.mobno=sc.nextLine();
        System.out.print("Enter Initial Amount:");
        ob.amount=sc.nextFloat();
    }
    public static void main(String[] args){
        
    }
}