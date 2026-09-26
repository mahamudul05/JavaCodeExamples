public class MathOperations {
    public static void main(String[] args) {

        int number1=10;
        double number2=3.42;
        int number3=100;
        short number4= -50;
        double number5;
        double number6;

        number6=Math.E;
        number5=Math.PI;

        System.out.println("--------------------------Math Operations--------------------------");

        System.out.println("1.Max number between 10 and 50 is: "+Math.max(+number1,number3)); //Math.max(x,y) gives the max of 2 numbers

        System.out.println("-------------------------------------------------------------------");

        System.out.println("2.Min number between 10 and 50 is: "+Math.min(number1,number3)); //Math.min(x,y) gives the min of 2 numbers

        System.out.println("-------------------------------------------------------------------");

        System.out.println("3.Absolute value of -50 is: "+Math.abs(number4));                // Math.abs() converts a negative number to positive

        System.out.println("-------------------------------------------------------------------");

        System.out.println("4.value of PI: "+number5);                                       // Math.PI() gives the Value of PI=3.1416---

        System.out.println("-------------------------------------------------------------------");

        System.out.println("5.value of exponential: "+number6);                                // Math.E() gives the value of exponential

        System.out.println("-------------------------------------------------------------------");

        System.out.println("6.Square root of 9 is: "+Math.sqrt(number1));                         // Math.sqrt() gives the Square root value of a number

        System.out.println("-------------------------------------------------------------------");

        System.out.println("7.Round up value of 3.41 is : "+Math.round(number2));             // Math.round() sets a double number to its lowest or highest round number

        System.out.println("-------------------------------------------------------------------");

        System.out.println("8.Round up  value using ceil is: "+Math.ceil(number2));          // Math.ceil() rounds up the number to highest

        System.out.println("-------------------------------------------------------------------");

        System.out.println("9.Round up value using floor: "+Math.floor(number2));            // Math.floor() rounds up the number to lowest

        System.out.println("-------------------------------------------------------------------");

        System.out.println("10. 5 to the power 4 is : "+Math.pow(5,4));                        // Math.pow(x,y) gives x to the power y



    }

}
