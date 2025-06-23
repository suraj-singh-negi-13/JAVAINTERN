//Creating console based calculator
import java.util.Scanner;

class calculator{
    static int result=0;

    //addition
    static void addition(float []arr){
        for(float i:arr){
            result+=i;
        }
    }

    //substraction
    static void substraction(float []arr){
        for(float i:arr){
            result+=i;
        }
    }

    //multiplication
    static void multiplication(float []arr){
        for(float i:arr){
            result+=i;
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
            result+=i;
        }
    }
    System.out.println("The result is:"+result);

    //main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How much number's do you want to insert:");
        int numbers=sc.nextInt();
        float []ar=new float[numbers];
        for(int i=0;i<numbers;i++){
            ar[i]=sc.nextFloat();
        } 
        //Operations(addition,subtraction,multiplication,division)

    }
}