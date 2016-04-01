/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjsu.delcastillo.cs146.project1.part2;

/**
 *
 * @author Kiyeon
 * Kyle Del Castillo
 * CS 146 - Data Structures and Algorithms
 * Project 1 Part 2
 */

import java.util.Scanner;

public class QuickSort 
{
      /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        //Scanner input = new Scanner(System.in);
        QuickSortFunctions sortTest = new QuickSortFunctions();
        
        //String userInput;
        //int counter = 0; //Used for counting variables to create a tabled output
        int[] quickSortArray;
        int[] quickSelectArray;
        int[] n = {10000, 100000, 1000000, 10000000, 100000000};
        
        long startTime;
        long endTime;
        long totalTime;
        
        System.out.printf("Array Size %20d%13d%13d%13d%14d\n", n[0], n[1], n[2], n[3], n[4]);
        
        //Display total time of Quick Sort
        System.out.print("Total time of QS 1");
        for(int i = 0; i < n.length; i++)
        {
            quickSortArray = sortTest.generateArray(n[i]);
            
            //Starts the timer for the sorting of n numbers using Quick Sort
            startTime = System.currentTimeMillis();
            sortTest.quickSort(quickSortArray); //Sorts the array
            endTime   = System.currentTimeMillis();
            totalTime = endTime - startTime;
            
            System.out.format("%10d ms", totalTime);
        }
        System.out.println("");
        
        
        //Display total time of Quick Select
        System.out.print("Total time of QS 2");
        for(int i = 0; i < n.length; i++)
        {
            quickSelectArray = sortTest.generateArray(n[i]);
            
            //Starts the timer for the sorting of n numbers using Quick Sort
            startTime = System.currentTimeMillis();
            sortTest.SelectQuickSort(quickSelectArray); //Sorts the array
            endTime   = System.currentTimeMillis();
            totalTime = endTime - startTime;
            System.out.format("%10d ms", totalTime);
            
        }
        System.out.println();
        
        //Display comparison count for Quick Sort
        System.out.print("Comparisons in QS 1");
        for(int i = 0; i < n.length; i++)
        {
           sortTest.printComparison(i);
        }
        System.out.println();
        
        
        //Display comparison count for Quick Select
        System.out.print("Comparisons in QS 2");
        for(int i = 0; i < n.length; i++)
        {
           sortTest.printComparison2(i);
        }
        System.out.println();
        
        
        //REMOVE /* COMMENT IF YOU WANT A DETAILED REPORT WITH PRINT OPTIONS
        /* 
        //Quick Sort and Quick Select
        //Generate arrays and sort the array;
        System.out.println("\t\t***QUICK SORT ALGORITHM***\t\t");
        for(int i = 0; i < n.length; i++)
        {
            //Generate an array object with n values
            System.out.println("The array length is: " + n[i]);
            quickSortArray = sortTest.generateArray(n[i]);
            
            //Starts the timer for the sorting of n numbers using Quick Sort
            startTime = System.currentTimeMillis();
            sortTest.quickSort(quickSortArray); //Sorts the array
            endTime   = System.currentTimeMillis();
            totalTime = endTime - startTime;
            
            //Display sorted array
            System.out.println("Would you like to print the sorted array? Y/N ");
            System.out.print("Answer: ");
            userInput = input.nextLine();
            if(userInput.equals("Y") || userInput.equals("y"))
            {
                System.out.println("\nThe sorted array is: ");
                sortTest.printArray(quickSortArray, counter);
            }
            else
            {
                System.out.println("The array was not printed.");
            }
            
            
            //Display the running time of the algorithm
            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\nThe running time is " + totalTime + " milliseconds.");
            sortTest.getComparisons();
            
        }
        
        System.out.println("******************************************************************************************************************************");
        System.out.println("******************************************************************************************************************************");
        System.out.println("******************************************************************************************************************************\n");
        System.out.println("\t\t***QUICK SELECT ALGORITHM***\t\t");
        //Quick Select
        for(int i = 0; i < n.length; i++)
        {
            //Generate an array object with n values
            System.out.println("The array length is: " + n[i]);
            quickSelectArray = sortTest.generateArray(n[i]);
            
            //Starts the timer for the sorting of n numbers using Quick Sort
            startTime = System.currentTimeMillis();
            sortTest.SelectQuickSort(quickSelectArray); //Sorts the array
            endTime   = System.currentTimeMillis();
            totalTime = endTime - startTime;
            
            
            //Display sorted array
            System.out.println("Would you like to print the sorted array? Y/N ");
            System.out.print("Answer: ");
            userInput = input.nextLine();
            if(userInput.equals("Y") || userInput.equals("y"))
            {
                System.out.println("\nThe sorted array is: ");
                sortTest.printArray(quickSelectArray, counter);
            }
            else
            {
                System.out.println("The array was not printed.");
            }
            
            //Display the running time of the algorithm
            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\nThe running time is " + totalTime + " milliseconds.");
            sortTest.getComparisons2();
            
            
        }
            
        */
      
    }
    
}
 