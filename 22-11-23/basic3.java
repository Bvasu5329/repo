package java_programs;

import java.util.Arrays;
import java.util.Scanner;


//public class basic3{
//	public static void main(String[] args) {
//		int arr[]=new int[] {1,2,3,4,3,5,2,6,8,7,7};
//		System.out.println("these are the duplicate elements in the array : ");
//		for (int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if (arr[i]==arr[j] ) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
//	}
//}


// Searching an Element in Array/Linear Search


//class basic3 {
//	public static int basic3(int[] arr, int key) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == key) {
//				return i;
//			}
//		}
//		return -1;
//	}
//
//	public static void main(String a[]) {
//		int[] a1 = { 10, 20, 30, 50, 70, 90 };
//		int key = 70;
//		System.out.println(key + " is found at index: " + basic3(a1, key));
//	}
//}


// Searching an Element in Array/Binary Search

//class basic3 {
//	public static void main(String args[]) {
//		int numArray[] = { 5, 10, 15, 20, 25, 30, 35 };
//		System.out.println("The input array: " + Arrays.toString(numArray));
//
//		int key = 25;
//		System.out.println("\nKey to be searched=" + key);
//
//		int first = 0;
//
//		int last = numArray.length - 1;
//
//		int mid = (first + last) / 2;
//
//		while (first <= last) {
//
//			if (numArray[mid] < key) {
//				first = mid + 1;
//			} else if (numArray[mid] == key) {
//
//				System.out.println("Element is found at index: " + mid);
//				break;
//			} else {
//
//				last = mid - 1;
//			}
//			mid = (first + last) / 2;
//		}
//
//		if (first > last) {
//			System.out.println("Element is not found!");
//		}
//	}
//}
//


// Sort Elements in Array / Bubble Sort

//class basic3 {
//
//	public static void bubbleSort(int[] sort_arr, int len) {
//
//		for (int i = 0; i < len - 1; ++i) {
//
//			for (int j = 0; j < len - i - 1; ++j) {
//
//				if (sort_arr[j + 1] < sort_arr[j]) {
//
//					int swap = sort_arr[j];
//					sort_arr[j] = sort_arr[j + 1];
//					sort_arr[j + 1] = swap;
//
//				}
//			}
//		}
//	}
//
//	public static void main(String args[]) {
//		int[] array = { 10, 5, 3, 1, 24, 12 };
//		int len = array.length;
//		bubbleSort(array, len);
//
//		for (int i = 0; i < len; ++i) {
//			System.out.print(array[i] + " ");
//		}
//	}
//}


// Sort Elements in Array Using Built-in Methods
  
//public class basic3  
//{   
//public static void main(String[] args)   
//{   
//
//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
// 
//Arrays.sort(array);   
//System.out.println("Elements of array sorted in ascending order: ");  
// 
//for (int i = 0; i < array.length; i++)   
//{       
//System.out.println(array[i]);   
//}   
//}  
//}  


// How to Remove Junk or Special Characters in String

//import java.io.*;
//class basic3{
//    public static void main(String[] args)throws IOException{
//        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter a String \n");
//        String x=in.readLine();
//        x=x.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(x);
//    }
//}




