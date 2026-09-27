import java.util.Scanner;    // this line have to be mentioned for using scanner class


public class ScannerNotes {

    public static void main(String[] args) {


        System.out.println("------------------------------Learnig To take input uisng Scanner");

        System.out.println();


        Scanner input = new Scanner(System.in);                     //Scanner( name of the class)  input(name of your wish, we can use xyz also)= new Scanner(System.in);


        System.out.print("Enter Your Name: ");
        String name = input.nextLine();                                                                // data type variable name= obj.next.Line()
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        System.out.print("Enter Your Height: ");
        double height = input.nextDouble();

        System.out.print("Are you a Student       (true/false):  ");
        boolean isStudent = input.nextBoolean();

        System.out.println();

        /* nextInt()  is used to take integer data type as input

        nextDouble()  is used to take double data type as input

        nextBoolean()  is used to take boolean data type as input

        nextLine()    is used to take String data type as input

        next.Short()   is used to take short data type  as input

        next.Long()   is used to take long data type as input

        next.Byte()   is used to take byte data type as input

        next.Float() is used to take float data type as input

         */

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + height);
        System.out.println("You are a student " + isStudent);


    }



}
