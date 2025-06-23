//Creating console based calculator
import java.util.Scanner;

class calculator{
    static float result=0;

    //addition
    static void addition(float num){
        result+=num;
    }

    //substraction
    static void substraction(float num){
            result-=num;
    }

    //multiplication
    static void multiplication(float num){
            result*=num;
    }

    //division
    static void division(float num){
            if(num==0){
                System.out.println("can't divide by 0.");
                return;
            }
            result/=num;
    }
    static void clear(){
        result=0;
    }
    //main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=0;
        //Operations(addition,subtraction,multiplication,division)
        do{
            System.out.print("Enter a number:");
            float a=sc.nextFloat();
            System.out.println("\n1.ADDITION");
            System.out.println("2.SUBSTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out. println("4.DIVISIONN");
            System.out.println("0.Exit");
            System.out.println("5.Clear");
            System.out.print("Choose any operations:");
            ch=sc.nextInt();
            switch(ch){
                case 1: addition(a);
                   break;
                case 2: substraction(a);
                    break;
                case 3: multiplication(a);
                    break;
                case 4: division(a);
                    break;
                case 5: clear();
                    break;
                default:
                    System.out.println("Enter correct operation.");
            }
            System.out.println("Current result is :"+result);
        }while(ch!=0);
            System.out.println("The final result is:"+result);
    }
}