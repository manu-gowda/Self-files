package com.xworkz.practice;

public class TestRunner {
         
	        static class Test {
		 
		        int min;
		        int max;
		    }
		 
		    static Test getMinMax(int arr[], int low, int high)
		    {
		    	Test minmax = new Test();
		    	Test mml = new Test();
		    	Test mmr = new Test();
		        int mid;
		 
		       
		        if (low == high) {
		            minmax.max = arr[low];
		            minmax.min = arr[low];
		            return minmax;
		        }
		 
		       
		        if (high == low + 1) {
		            if (arr[low] > arr[high]) {
		                minmax.max = arr[low];
		                minmax.min = arr[high];
		            }
		            else {
		                minmax.max = arr[high];
		                minmax.min = arr[low];
		            }
		            return minmax;
		        }
		 
		       
		        mid = (low + high) / 2;
		        mml = getMinMax(arr, low, mid);
		        mmr = getMinMax(arr, mid + 1, high);
		 
		     
		        if (mml.min < mmr.min) {
		            minmax.min = mml.min;
		        }
		        else {
		            minmax.min = mmr.min;
		        }
		 
		       		        if (mml.max > mmr.max) {
		            minmax.max = mml.max;
		        }
		        else {
		            minmax.max = mmr.max;
		        }
		 
		        return minmax;
		    }
		 
		   		    public static void main(String args[])
		    {
		        int arr[] = { 2000, 12, 564, 2, 499,  };
		        int arr_size = 6;
		        Test minmax = getMinMax(arr, 0, arr_size - 1);
		        System.out.printf("\nMinimum element is %d",
		                          minmax.min);
		        System.out.printf("\nMaximum element is %d",
		                          minmax.max);
		    }
		
	

	}




