/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjsu.delcastillo.cs146.project1.part2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kiyeon
 * Kyle Del Castillo
 * CS 146 - Data Structures and Algorithms
 * Project 1 Part 2
 * 
 */
public class QuickSortFunctions 
{
    
    long comparisons = 0; //First comparison count for Quick Sort
    long comparisons2 = 0; //Second comparison count for Quick Select
    
    long[] comparisonArrayQuickSort = new long[5]; //Array used for comparison count
    long[] comparisonArrayQuickSelect = new long[5];
    
    int index = 0; //Used for Quick Sort
    int index2 = 0; //Used for Quick Select
    Random rand = new Random();
   
    //Generate an array with random numbers and random size input
    public int[] generateArray(int n)
    {
        int[] array = new int[n]; //Array to sort
        
        for(int i = 0; i < array.length; i++)
        {   
            /*The random int value cap is 100000 to prevent Stack Overflow. 
             If the number is too low, once n becomes 100,000,000, we get the error.
             The issue will occur when we recursively call the sort function.
             Alternatively, we can change it to long to prevent the overflow as well.
            */
            array[i] = rand.nextInt(100000) ;        
        }
        
        return array;
    }
    
    //Generate a small n array used for testing
    public int[] generateSmallArray(int n)
    {
        int[] array = new int[n]; //Array to sort
        
        for(int i = 0; i < array.length; i++)
        {   
            array[i] = rand.nextInt(10) ;        
        }
        
        return array;
    }
    
    //Quick Sort function that calls the primary quickSort function
    public void quickSort(int[] array)
    {
        standardQuickSort(array, 0, array.length-1);
        comparisonArrayQuickSort[index] = comparisons;//Save the comparison count to a comparison array;
        index++; //Increment the index for the comparison array
    }
    
    //Sort the array
    public void standardQuickSort(int[] array, int first, int last)
    {
        if(first < last)
        {
            int q = partitionQuickSort(array, first, last); //q partitions the
            standardQuickSort(array, first , q-1); //Sort the first half of the array
            standardQuickSort(array, q+1, last); //Sort the second half of the array
        } 
    }
     
    //Partition function for Quick Sort
    private int partitionQuickSort(int[] array, int p, int r)
    {
        int pivot = array[r]; //Set pivot as the last element of the array
        
        int i = p - 1; //Middle of the array
        
        for(int j = p; j < r; j++)
        {
            comparisons++; //Add to the comparison
            if(array[j] <= pivot)
            {
                i++;
                swap(array, i, j);
            }
            
        }
        
        swap(array, i+1, r);
        return (i + 1);
    }
    
    //Quick Select function that calls the primary quickSelect function
    public void SelectQuickSort(int[] array)
    {
        int kth = (array.length)/2 + 1; //Divide the array size by 5 to find the kth element
        quickSelect(array, 0, array.length-1, kth);
        
        comparisonArrayQuickSelect[index2] = comparisons2;//Save the comparison count to a comparison array;
        index2++; //Increment the index for the comparison array
        
    }
   
    
    //Insertion Sort method used to sort array
    public void InsertionSort(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int j;
            comparisons2++;
            for(j = i - 1; j >= 0 && temp < array[j]; j--)
            {
                array[j+1] = array[j];
                
            } 
            
            array[j+1] = temp;
        }
    }
   
    //Main Quick Select method
    public int quickSelect(int[] array, int left, int right, int n)
    {
        //Base case
        if(left == right)
        {
            return array[left];
        }
        
        /*If the array has a length of less than or equal to 5, sort the array. 
        There is no reason to partition if we have a small size n
        This also serves as another base case
        */
        if(right - left <= 5)
        {
            InsertionSort(array);
            return array[n];
        }
        
        int kthLargestElement = partitionSelection(array,left,right);//Sort the kth largest element
        int subarrayLength = kthLargestElement - left + 1; //Move to the current subarray
        
        if(subarrayLength == n) //If k is the median, return k
        {
            return array[kthLargestElement];
        }
        else if(subarrayLength > n) //K > median, recurse through left subarray
        {
            return quickSelect(array,left,kthLargestElement-1,n);
        }
        else //Recurse through right
        {
            return quickSelect(array,kthLargestElement+1,right,n-subarrayLength);
        }
       
    }
 
    //Partition into subarrays
    public int partitionSelection(int[] array, int left, int right)
    {
        int pivotValue = pivot(array, left, right); //Using median of medians as pivot, recursively      
        
        while(left <= right)
        {
            while(array[left] < pivotValue)
            {
                comparisons2++;
                left++;
            }
            
            while(array[right] > pivotValue)
            {
                comparisons2++;
                right--;
            }
            
            if(array[left] == array[right])
            {
                left++;
            }
            else if(left < right)
            {
                swap(array, left, right);
            }
                
        }
        return right;
    }
    
    //Pivot finding for the median of medians
    public int pivot(int[] array, int left, int right)
    {
        int mid = right - left + 1;
        
        if(mid <= 10) //If the array is small, sort the array and return the median
        {
            InsertionSort(array);
            return array[array.length/2];
        }
        
        int[] subArrays; //Array to partition into 5 element subarrays
        int[] medianArray = new int[(int)Math.ceil((double)(mid)/5)]; //Array for the medians of each subarray
        int medianIndex = 0; //Used to set the index to 0 for the medianArray
        
        while(left <= right)
        {
            int nextLength = 5; //Length of the subarray is 5
            subArrays = new int[nextLength];
            
            for(int i = 0 ; i < subArrays.length && left <= right; i++)
            {
                subArrays[i] = array[left]; //Copy the value of the main array into the subarray
                left++; //Increment left for copying purposes
            }
            
            InsertionSort(subArrays); //Sort the subarray
            medianArray[medianIndex] = subArrays[subArrays.length/2]; //Get the mean of the subarray and store it to the medianArray
            medianIndex++;
        }
        
        return pivot(medianArray, 0, medianArray.length-1); //Recursion
    }
    
    
    //Swap function
    public void swap(int[] array , int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    //Print the array
    public void printArray(int[] array, int counter)
    {
        
        for(int i = 0; i < array.length; i++)
        {
            
            if(counter < 10) //Keep printing until we have 10 values in each row
            {
                System.out.print("\t" + array[i]);
            }
            else //New row
            {
                counter = 0; 
                System.out.print("\n\t" + array[i]);
            }
            
            counter++; //Add counter
        }
        System.out.println();
        
    }
    
    //Print the amount of comparisons for each n
    public void printComparison(int i)
    {
        System.out.format("%13d", comparisonArrayQuickSort[i]);
        comparisons = 0; //Reset the comparison after printing
    }
    
    public void printComparison2(int i)
    {
        System.out.format("%13d", comparisonArrayQuickSelect[i]);
        comparisons2 = 0;
    }
 
}
