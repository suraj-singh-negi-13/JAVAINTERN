//Student Record management System
/*
Task 2 :Student Record Management System
Objective: Create a CLI-based CRUD system for managing student records.
Tools :Java, VS Code/IntelliJ CE.
Deliverables: Java program with classes and menu options.

 */
import java.util.Scanner;
import java.util.ArrayList;

class Student{
    ArrayList<Student> list=new ArrayList<>();
    String name="";
    String id="";
    int marks=0;
    Student(String name,String id,int marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }

    static void addStudent(id,name,marks){
        
        Student ob=new Student(id,name,marks);
        list.add(ob);        
    }

    static void removeStudent(String search){
        for(Student s: list){
            list.removeIf(s->id.equals(search));
        }
    }

    static void updateStudent(){

    }

    static void searchStudent(){
        
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("|||||||||MENU|||||||||");
            System.out.println("1.Add Student.");
            System.out.println("2.Remove Student.");
            System.out.println("3.Update Student.");
            System.out.println("4.Display Student.");
            System.out.println("5.Exit");
            int op=sc.nextInt();
            switch(op){
                case 1: String id=sc.nextLine();
                        String name=sc.nextLine();
                        int marks=sc.nextInt();
                        addStudent(id,name,marks);
                        System.out.println("Student Added successfully...");
                        break;
                case 2: removeStudent();
                        System.out.println("Student removed successfully...");
                        break;
                case 3: updateStudent();
                        System.out.println("Student data updated successfully...");
                        break;
                case 4: searchStudent();
                        break;
                case 5: System.exit(0);
                        break;
                default:
                        System.out.println("Choose correct option..");
            }
        }while(true);
    }
}