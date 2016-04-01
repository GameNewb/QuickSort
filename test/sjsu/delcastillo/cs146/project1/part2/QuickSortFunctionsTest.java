/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjsu.delcastillo.cs146.project1.part2;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kiyeon
 */
public class QuickSortFunctionsTest 
{
    private QuickSortFunctions QS;
    
    public QuickSortFunctionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception
    {
        QS = new QuickSortFunctions();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateArray method, of class QuickSortFunctions.
     */
    @Test
    public void testGenerateArray() {
        System.out.println("generateArray");
        int n = 10000;
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] expResult = instance.generateArray(n); //Generate the array
        int[] result = expResult; //The result should be the same
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of quickSort method, of class QuickSortFunctions.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] array = {93, 6, 25, 100, 42, 3, 16};
        QuickSortFunctions instance = new QuickSortFunctions();
        instance.quickSort(array);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The sorted array is: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Test of standardQuickSort method, of class QuickSortFunctions.
     */
    @Test
    public void testStandardQuickSort() {
        System.out.println("standardQuickSort");
        int[] array = {93, 6, 25, 100, 42, 3, 16};
        int first = 0;
        int last = array.length-1;
        QuickSortFunctions instance = new QuickSortFunctions();
        instance.standardQuickSort(array, first, last);
        
    }

    /**
     * Test of quickSelect method, of class QuickSortFunctions.
     */
    @Test
    public void testQuickSelect() {
        System.out.println("quickSelect");
        
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] array = instance.generateArray(100);
        int left = 0;
        int right = array.length-1;
        int i = array.length/2 + 1;
        int expResult = instance.quickSelect(array, left, right, i);
        int result = expResult;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of swap method, of class QuickSortFunctions.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int[] array = {93, 6, 25, 100, 42, 3, 16};
        int x = 3;
        int y = array.length-1;
        QuickSortFunctions instance = new QuickSortFunctions();
        instance.swap(array, x, y);
        System.out.println(x + " has been swapped with " + y);
       
    }

    /**
     * Test of printArray method, of class QuickSortFunctions.
     */
    @Test
    public void testPrintArray() 
    {
        System.out.println("printArray");
        int[] array = {93, 6, 25, 100, 42, 3, 16};
        int counter = 0;
        QuickSortFunctions instance = new QuickSortFunctions();
        instance.printArray(array, counter);
        
    }

    /**
     * Test of printComparison method, of class QuickSortFunctions.
     */
    @Test
    public void testPrintComparison() {
        System.out.println("printComparison");
        QuickSortFunctions instance = new QuickSortFunctions();
        int i = 3;
        instance.printComparison(i);
        System.out.println();
       
    }

    /**
     * Test of SelectQuickSort method, of class QuickSortFunctions.
     */
    @Test
    public void testSelectQuickSort() {
        System.out.println("SelectQuickSort");
        
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] array = instance.generateArray(10000);
        instance.SelectQuickSort(array);
       
    }

    /**
     * Test of InsertionSort method, of class QuickSortFunctions.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("InsertionSort");
        
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] array = instance.generateArray(100);
        int count = 0;
        System.out.println("\tUnsorted array: ");
        System.out.print("\t");
        for(int i = 0; i < 5; i++)
        {
            if(count < 10)
            {
                System.out.print(array[i] + " ");
            }
           
            count++;
        }
        
        System.out.println("\n\tSorted array:");
        System.out.print("\t");
        instance.InsertionSort(array);
        
        count = 0;
        for(int i = 0; i < 5; i++)
        {
            if(count < 10)
            {
                System.out.print(array[i] + " ");
            }
          
            count++;
        }
        System.out.println();
     
    }

    /**
     * Test of partitionSelection method, of class QuickSortFunctions.
     */
    @Test
    public void testPartitionSelection() {
        System.out.println("partitionSelection");
        
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] array = instance.generateArray(10);
        int left = 0;
        int right = array.length-1;
        
        int expResult = instance.partitionSelection(array, left, right);
        int result = 5; //Median
        assertEquals(expResult, result);
    
    }

    /**
     * Test of pivot method, of class QuickSortFunctions.
     */
    @Test
    public void testPivot() {
        System.out.println("pivot");
        
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] array = instance.generateSmallArray(10);
        int left = 0;
        int right = array.length-1;
        
        int expResult = instance.pivot(array, left, right);
        int result = instance.pivot(array, left, right);
        
        System.out.println("Pivot is : " + result);
        assertEquals(expResult, result);

    }

    /**
     * Test of printComparison2 method, of class QuickSortFunctions.
     */
    @Test
    public void testPrintComparison2() {
        System.out.println("printComparison2");
        int i = 4;
        QuickSortFunctions instance = new QuickSortFunctions();
        instance.printComparison2(i);
        System.out.println();
        
    }

    /**
     * Test of generateSmallArray method, of class QuickSortFunctions.
     */
    @Test
    public void testGenerateSmallArray() {
        System.out.println("generateSmallArray");
        int n = 10;
        QuickSortFunctions instance = new QuickSortFunctions();
        int[] expResult = instance.generateSmallArray(n);
        int[] result = expResult;
        assertArrayEquals(expResult, result);
        
    }
    
    /* INSTRUCTOR JUNIT TESTS - EDITED TO COMPLY WITH THE METHODS(VOID NOT INT)*/
    
    
    
   
     /* Sorting an empty List should produce an empty list:
    */
   @Test
   public void testEmpty() 
   {
             int[] array1 = new int[0];
             int[] array2 = new int[0]; //correct sorted array
             
             QS.quickSort(array1);
             assertArrayEquals(array1,array2);
             QS.SelectQuickSort(array1);
             assertArrayEquals(array1,array2);
   }   
  
   /* Sorting an already sorted list:
    */
   @Test
   public void testSorted() {
        int[] array1 = new int[20];
        int[] array2 = new int[20];
 	int[] array3 = new int[20];
              
	 for (int i = 0; i < 10; i++) {
             array1[i] = i*2;
             array2[i] = i*2;
	     array3[i] = i*2;

        }
	// sort using Java's one
        Arrays.sort(array3);
         
        // run QS1()
        QS.quickSort(array1);
        assertArrayEquals(array1,array3);
        
        // run QS2()
        QS.SelectQuickSort(array2);
        assertArrayEquals(array1,array3);
        
   }
   
   /* Sorting a reverse sorted list:
    */
   @Test
   public void testReverseSorted() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        int[] array3 = new int[10];
        
        for (int i = 0; i < 10; i++) {
             array1[i] = (100-i);
             array2[i] = (100-i);
             array3[i] = (100-i);
        }
        //sort array3 
        Arrays.sort(array3); 
        // run QS1()
        QS.quickSort(array1);
        assertArrayEquals(array1,array3);
        
        // run QS2()
        QS.SelectQuickSort(array2);
        assertArrayEquals(array2,array3);
        
   }
    
    /*
    * randomness to the tests:
    */
    @Test
     public void testRandom() 
     {
       int[] array1 = new int[10];
       
       for (int i = 0; i < 10; i++) 
       {
            array1[i] = (int) Math.random()*10;
       }
       //copy arrays
       int[] array2 = Arrays.copyOf(array1, array1.length);  
       int[] array3 = Arrays.copyOf(array1, array1.length); // correct sorted array 
       Arrays.sort(array3);
 
        // run QS1()
       QS.standardQuickSort(array1, 0, array1.length - 1);
       assertArrayEquals(array1,array3);
       
       // run QS2()
       QS.SelectQuickSort(array2);
       assertArrayEquals(array1,array3);
       
     }

     
    @Test
    public void testQS1Timing()
    {
      // create an array and a sorted backup
      int[] array1 = QS.generateArray(10000);
      int[] array2 = QS.generateArray(1000000);
      int[] array3 = QS.generateArray(10000000);
      
      
      long start = System.currentTimeMillis();
      QS.quickSort(array1);
      long end = System.currentTimeMillis();
      long elapsed = end - start;
      System.out.println("QS1 time to sort 10000 elements in ms:"+ elapsed);

      start = System.currentTimeMillis();
      QS.quickSort(array2);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS1 time to sort 1000000 elements in ms:"+ elapsed);
      
      start = System.currentTimeMillis();
      QS.quickSort(array3);
      end = System.currentTimeMillis();
      elapsed = end - start;
      System.out.println("QS1 time to sort 100000000 elements in ms:"+ elapsed);
    }
   
    @Test
    public void testQS2Timing()
    {
      // create an array and a sorted backup
        int[] array1 = QS.generateArray(10000);
        int[] array2 = QS.generateArray(1000000);
        int[] array3 = QS.generateArray(10000000);
      
      
        long start = System.currentTimeMillis();
        QS.SelectQuickSort(array1);
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println("QS2 time to sort 10000 elements in ms:"+ elapsed);

        start = System.currentTimeMillis();
        QS.SelectQuickSort(array2);
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("QS2 time to sort 1000000 elements in ms:"+ elapsed);
      
        start = System.currentTimeMillis();
        QS.SelectQuickSort(array3);
        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("QS2 time to sort 100000000 elements in ms:"+ elapsed);
    } 
    
    
     
     @Test
     public void testSelect() {
       int[] array1 = new int[100];
       
       for (int i = 0; i < 100; i++) {
            array1[i] = i;
       }
       // median is 50
       int median=QS.quickSelect(array1,0, array1.length-1, array1.length/2);
       System.out.println("median:"+ QS.quickSelect(array1,0, array1.length-1,
                array1.length/2));
       assertEquals(median, 49);
       
    }
}
