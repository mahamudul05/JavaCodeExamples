import java.util.ArrayList; // Used For dynamic Arrays

import java.util.Arrays;  //Used  For traditional Arrays

import java.util.*; // Imports Arrays , Arrays list and other  utilities

public class ArrayNotes {
  public   static void main(String[] args) {

      System.out.println("--------------------------------Traditional Arrays----------------------------------");

      int [] traditonalArrays;        // Declaration= datatype[] arrayName;

      traditonalArrays= new int[5];    // Allocation = arrayName= new datatype[size];

      String[] stringArray= new String[]{"Mahamudul","Mahin","Jakir"};   // inline declaration and allocation in one step

      double [] doubleArray={3.11, 2.44, 4.99};

      for(int i=0;i< stringArray.length;i++){                                    // for loop syntax is as same as c programing
          System.out.println("At index "+i +" element is "+stringArray[i]);

      }


      System.out.println("--------------------------------2D Arrays----------------------------------");

      int [][] matrixArray= new int[3][2];            // Datatype [][]=new datatype[row size][colum size];
      matrixArray[0][0]=1;
      matrixArray[0][1]=2;                         //2d array[row position ][colum position] = value that i want to store;
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


      String [][] dstring={{"Mahamudul","Jakirul"},{"Mahin","Mahfuz"},{"Shourav","Sadman"},{"Fatin","Pranto"}};  // we can intialize in this way also

      for(int i=0;i<dstring.length;i++){
          System.out.println();

          for(int j=0;j<dstring[i].length;j++){

              System.out.print(dstring[i][j]+" ");
          }
      }



      System.out.println("--------------------------------Array List----------------------------------");


    }
}
