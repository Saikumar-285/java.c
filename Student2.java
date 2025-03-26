import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String name;
        System.out.print("enter the name=:" );
        name = Scanner.nextLine();
        String profession;
        System.out.print("enter the profession=:");
        profession = Scanner.nextLine();
        int age;
        System.out.print("enter the age=:" );
        age = Scanner.nextInt();
        if (age >= 11 && age <= 19) {
            System.out.println("you are in teenage");
        }else if (age >= 19 && age <= 28){
            System.out.println("your age is not teenage");
        }else{
            System.out.println("Invalid");
        }

    }
}
