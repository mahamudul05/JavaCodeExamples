import java.util.ArrayList; // Used For dynamic Arrays

import java.util.Arrays;  //Used  For traditional Arrays

import java.util.*; // Imports Arrays , Arrays list and other  utilities

public class ArrayNotes {
  public   static void main(String[] args) {



      System.out.println("--------------------------------Traditional Arrays----------------------------------");

      int [] traditionalArrays;                                                  // Declaration= datatype[] arrayName;

      traditionalArrays= new int[5];                                                      // Allocation = arrayName= new datatype[size];

      String[] stringArray= new String[]{"Mahamudul","Mahin","Jakir"};                       // inline declaration and allocation in one step

      double [] doubleArray={3.11, 2.44, 4.99};

      for(int i=0;i< stringArray.length;i++){                                                                 // for loop syntax is as same as c programing
          System.out.println("At index "+i +" element is "+stringArray[i]);

      }





      System.out.println("--------------------------------2D Arrays----------------------------------");

      int [][] matrixArray= new int[3][2];                                                   // Datatype [][]=new datatype[row size][colum size];
      matrixArray[0][0]=1;
      matrixArray[0][1]=2;                                                                 //2d array[row position ][colum position] = value that i want to store;
      matrixArray[1][0]=3;
      matrixArray[1][1]=4;
      matrixArray[2][0]=5;
      matrixArray[2][1]=6;

      for(int i=0;i<matrixArray.length;i++){
          System.out.println();

          for(int j=0;j<matrixArray[i].length;j++){

              System.out.print(matrixArray[i][j]+" ");
          }
      }


      System.out.println();







      System.out.println("--------------------------------2D Arrays Another way----------------------------------");


      String [][] dstring={{"Mahamudul","Jakirul"},{"Mahin","Mahfuz"},{"Shourav","Sadman"},{"Fatin","Pranto"}};             // we can intialize in this way also

      for(int i=0;i<dstring.length;i++){
          System.out.println();

          for(int j=0;j<dstring[i].length;j++){

              System.out.print(dstring[i][j]+" ");
          }
      }



      System.out.println("--------------------------------Array List----------------------------------");   // Array has a fixed size but Array List is dynamic

      ArrayList<String> arrayList= new ArrayList<String>();                                  // creating object using ArrayList class just like we use scanner

      System.out.println();

      arrayList.add("Tonoy");                                                                  // add()---Adds an element to the end of the list

      arrayList.add("Naim");
      arrayList.add("Shihab");



      System.out.println("---------------------------------Geting the value Using get(index)---------------------------------");

      // printing using get()

      System.out.println("At index 0 "+arrayList.get(0));                                           //get()--Returns the element at the specified position
      System.out.println("At index 1 "+arrayList.get(1));
      System.out.println("At index 2 "+arrayList.get(2));

      System.out.println();



      System.out.println("---------------------------------Replacing value Using Set(index,value)---------------------------------");

                                                                                 //  set()--Replaces the element at the specified position

      arrayList.set(2,"Value changed using set");
      System.out.println("At index 2 "+arrayList.get(2));

      System.out.println();

      System.out.println("---------------------------------Removing value Using remove(index)---------------------------------");

      arrayList.remove(2);                                                                                //remove()--Removes the element at the specified position

      System.out.println();


      System.out.println("After removing element from index 2 size of the array is: "+ arrayList.size());  // size()-- Returns the number of elements in the list



    }
}
