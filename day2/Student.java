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
    String name;
    String id;
    int marks;
    Student(){

    }

    Student(String id,String name,int marks){
        this.name=name;
        this.id=id;
        this.marks=marks;
    }

    void addStudent(String id,String name,int marks){   
        Student ob=new Student(id,name,marks);
        list.add(ob);        
    }

    void removeStudent(String search){
        for(Student s: list){
            if((s.id).equals(search)){
                list.remove(s);
                System.out.println("Student removed successfully...");
                return;
            }
        }
        System.out.println("Student not found....");
    }

    void updateStudent(Scanner sc){
        sc.nextLine();
        System.out.print("Enter ID:");
        String id=sc.nextLine();
        if(!uniqueId(id)){
            System.out.println(" Student ID not found...");
            return;
        }
        for(Student s: list){
            if((s.id).equals(id)){
                System.out.print("Enter new Name:");
                s.name=sc.nextLine();
                 System.out.print("Enter new Marks:");
                s.marks=sc.nextInt();
                System.out.println("Student data updated successfully...");
                break;
            }
        }
    }

    void displayStudent(){
            System.out.println(" ID          NAME             Marks\n");
        for(Student s: list){
            System.out.println(s.id+"       "+s.name+"       "+s.marks);
        }
    }

    boolean uniqueId(String id){
        for(Student s:list){
            if((s.id).equals(id)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student st=new Student();
        do{
            System.out.println("|||||||||MENU|||||||||");
            System.out.println("1.Add Student.");
            System.out.println("2.Remove Student.");
            System.out.println("3.Update Student.");
            System.out.println("4.Display Student.");
            System.out.println("5.Exit");
            System.out.print("Choose Operations:");
            int op=sc.nextInt();
            switch(op){
                case 1: System.out.print("Enter ID:");
                        sc.nextLine();
                        String id=sc.nextLine();
                        if(st.uniqueId(id)){
                            System.out.println("ID already exist...");
                            break;
                        }
                        System.out.print("Enter Name:");
                        String name=sc.nextLine();
                        System.out.print("Enter Marks:");
                        int marks=sc.nextInt();
                        st.addStudent(id,name,marks);
                        System.out.println("Student Added successfully...");
                        break;
                case 2: sc.nextLine();
                        System.out.print("Enter ID:");
                        String search=sc.nextLine();
                        st.removeStudent(search);
                        break;
                case 3: st.updateStudent(sc);
                        break;
                case 4: st.displayStudent();
                        break;
                case 5: System.exit(0);
                        break;
                default:
                        System.out.println("Choose correct option..");
            }
        }while(true);
    }
}