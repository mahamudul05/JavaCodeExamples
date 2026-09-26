import java.util.StringTokenizer;

public class StringNote {
   public static void main(String[] args) {

        String data1="I am Mahamudul Haque. ";


        System.out.println("Before concation :"+data1);
        System.out.println();
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
        String data2=" I am a Student of Daffodil International University.";
        System.out.println("Before concatation: "+data2);
        System.out.println();
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("After Adding two strings together");

        String stringConcat= data1+data2;
        System.out.println(stringConcat);
        System.out.println();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
                               //String Tokenizer
        StringTokenizer tokenExample = new StringTokenizer(stringConcat);

        System.out.println("The number of word in the String:  "+tokenExample.countTokens()); //counts the words in a string

        // Note: nextElement() and nextToken() consume tokens sequentially!

        System.out.println("Print elements one by one : "+tokenExample.nextElement()); // prints the elements one by one

        System.out.println("Prints the next element: "+tokenExample.nextToken());// works same as next element

        System.out.println("Does the string contains any elements: "+tokenExample.hasMoreElements()); // gives a true or false value , checks the string is empty or not

        System.out.println("Does the string contains any elements: "+tokenExample.hasMoreTokens()); // same as has more elements
        System.out.println();
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

        //String Operations
        System.out.println("String operations");
        System.out.println("The First charechter of the string: "+data1.charAt(0)); // Finds  char at a given index
        System.out.println("The length of the String: "+data1.length());
        System.out.println("The sub part of a String: "+data2.substring(5,11)); // Takes index 5 to 10 ("a Stud")

        System.out.println("Are  both strings same: "+data1.equals(data2)); // compares two strings if they are same or not
        System.out.println("Are both strings same ignoring capital and small letter case: "+data1.equalsIgnoreCase(data2)) ; //compares two strings without capital letter small letter , means a=A.
        System.out.println("Does the string Contains Mahamudul: "+ data1.contains("Mahamudul"));
        System.out.println("Does the string start with I: "+data1.startsWith("I"));
        System.out.println("The index of am in strng : "+data1.indexOf("am"));
        System.out.println("Transform the string to uppper case: "+data1.toUpperCase());
        System.out.println("Tranform the string to lower case: "+data1.toLowerCase());


        System.out.println(data1.trim());              // Removes leading and trailing whitespaces.
        System.out.println(data1.replace("m", "s"));


    }

}
