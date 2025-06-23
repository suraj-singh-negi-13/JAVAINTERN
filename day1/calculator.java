//Creating console based calculator
import java.util.Scanner;

class calculator{
    static float result=0;

    //addition
    static void addition(float []arr){
        for(float i:arr){
            result+=i;
        }
    }

    //substraction
    static void substraction(float []arr){
        for(float i:arr){
            result-=i;
        }
    }

    //multiplication
    static void multiplication(float []arr){
        for(float i:arr){
            result*=i;
        }
    }

    //division
    static void division(float []arr){
        for(float i:arr){
            if(i==0){
                System.out.println("can't divide by 0.");
                result=0;
                break;
            }
            result/=i;
        }
    }

    //main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Operations(addition,subtraction,multiplication,division)
        System.out.println("\n1.ADDITION");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISIONN");
        System.out.print("Choose any operations:");
        int ch=sc.nextInt();
        System.out.print("How much number's do you want to insert:");
        int numbers=sc.nextInt();
        float []ar=new float[numbers];
        for(int i=0;i<numbers;i++){
            ar[i]=sc.nextFloat();
        } 
        switch(ch){
            case 1: addition(ar);
                break;
            case 2: substraction(ar);
                break;
            case 3: multiplication(ar);
                break;
            case 4: division(ar);
                break;
            default:
                System.out.println("Enter correct operation.");
        }
        System.out.println("The result is:"+result);
    }
}