//Write a Java program to sort a numeric array and a string array. Go to the editor
import java.util.Scanner;
import java.util.*;
class Array01{

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=scn.nextInt();
}
Array.sort(arr);
System.out.println(arr[n-2]);
	
	}//end of the main method
}//end of the class
