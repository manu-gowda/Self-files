package com.xworkz.practice;

public class doubleArrayIntValue {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 8, 1 }, k = 2;
		int n = arr.length;
		System.out.print(findValue(arr, n, k));

		
		
		static int findValue(int arr[], int n, int k) {
			boolean exist = true;
			 
			while (exist) {
				exist = false;
				for (int i = 0; i < n; i++) {
					// Check is a[i] is equal to k
					if (arr[i] == k) {
						k *= 2;
						exist = true;
						break;
					}
				}
			}
		
		}
	}
		
			