import java.lang.reflect.Array;
import java.util.*; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
/*
Array concept
@version 0.1.0
@Author: Chuong T. N. Mayian
* */
public class Main {
    public static void main(String[] args){
        // Task one.
        int[][] employeeHoursList = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,2},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {6,3,5,9,2,7,9},
                {7,5,6,6,6,4,4}
        };// the array of the hours of work
        String[] employeeDate = {"Su","M","T","W","T","F","Sa"}; // The day employee spent at work
        System.out.println("Days: "+Arrays.toString(employeeDate));
        System.out.println("----------------------------------------");
        int[] totalHoursList = new int [employeeHoursList.length];
        for(int i = 0; i < employeeHoursList.length;i++){
            int totalHours = 0; //initializing the total off the hours spent by employee
            for (int k = 0; k<employeeHoursList[i].length;k++){
                totalHours = totalHours+employeeHoursList[i][k];
            }
            totalHoursList[i] = totalHours;
        }
        // Performing a simple bubble sort for the total ours per employee.
        for (int i = 0;i<employeeHoursList.length;i++){
          for (int k = 0;k<employeeHoursList[i].length-1;k++){
              if(totalHoursList[k]>totalHoursList[k+1]){

                  //swapping the numbers
                  int tempTotal = totalHoursList[k];
                  totalHoursList[k] = totalHoursList[k+1];
                  totalHoursList[k+1] = tempTotal;

                  //swapping the rows values
                  int[] temRow = employeeHoursList[k];
                  employeeHoursList[k] = employeeHoursList[k+1];
                  employeeHoursList[k+2] = temRow;

              }
          }
          //Displaying the result on the screen
            System.out.println("Employee "+i+" "+Arrays.toString(employeeHoursList[i])+" | "+" Hours: "+totalHoursList[i]);
        }

        // Task two
    }
}