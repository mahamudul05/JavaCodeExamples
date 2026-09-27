import java.util.Scanner;

public class ConditionalStatements {


    static void main(String[] args) {

        Scanner age= new Scanner(System.in);

        System.out.print("Enter your Age: ");

        int Age= age.nextInt();

        if(Age>=18&& Age<=59){

            System.out.println("You are an adult");
        }
        else if(Age<18 &&  Age>=12){

            System.out.println("You are a Minor");
        } else if (Age<12 && Age>=1) {
            System.out.println("You are a child");

        }

        else{

            System.out.println("Invalid");
        }





        // switch case



    }
}
