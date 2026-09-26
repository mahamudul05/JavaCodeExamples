public class Main{

   public static void main(StringNote[]args) {

       int integerType= 10;
       double doubleType= 3.44;
       boolean booleanType= true;
       char charType= 'A';
       float floatType= 3.44f;              // f is written to make the compiler understand that its a float data not double

       short shortType= -415;              //short is twice as small as an int (which is 16-bit), making it highly efficient for memory-constrained environments. Range: (-32,768 to 32,767 )

       byte byteType= -100;                //It is four times smaller than an int (8-bit), making it highly effective for massive datasets with small numeric ranges( -128 to 127).  Syntax and Declaration
       long longType= 15000000000l;
       String stringType="Mahamudul";




       /*Two types of type casting in java
       1. Widening casting (automatically typecast) byte -> short -> char -> int -> long -> float -> double

       2. Narrowing casting(Must be done Manually)  double -> float -> long -> int -> char -> short -> byte

        */

       //1. Widening casting
       int myInt1 = 9;
       double myDouble1 = myInt1; // Automatic casting: int to double

       System.out.println(myInt1);    // Outputs 9
       System.out.println(myDouble1); // Outputs 9.0

       //2. Narrowing casting
       double myDouble2 = 9.78d;
       int myInt2 = (int) myDouble2; // Manual casting: double to int syntax (type that i want )variable

       System.out.println(myDouble2); // Outputs 9.78
       System.out.println(myInt2);    // Outputs 9








   }

}