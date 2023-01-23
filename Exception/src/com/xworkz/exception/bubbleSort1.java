package com.xworkz.exception;



		
		import java.util.Scanner;
		import java.util.Arrays;

		public class bubbleSort1 {

		    public static void bubbleSort1(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n-1; i++) {
		            for (int j = 0; j < n-i-1; j++) {
		                if (arr[j] > arr[j+1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		            }
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();
		        int[] array = new int[size];
		        System.out.print("Enter the elements of the array: ");
		        String input = sc.nextLine();
		        String[] inputArr = input.split(" ");
		        for (int i = 0; i < size; i++) {
		            array[i] = Integer.parseInt(inputArr[i]);
		        }
		        bubbleSort1(array);
		        System.out.println("Sorted Array: " + Arrays.toString(array));
		    }
		}


