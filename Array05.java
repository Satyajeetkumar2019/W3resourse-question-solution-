// Write a Java program to find the index of an array element
import java.util.Scanner;
class Array05 {
static private int n;
static private int m;
static private int i;
static private int count;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the length of an array :");
	n=scn.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array values :");
for( i=0;i<n;i++){
arr[i]=scn.nextInt();
}
System.out.println("Enter the values to find index number :");
m=scn.nextInt();
for(int i=0;i<n;i++){
if(m==arr[i])
	count=i;
break;
}
System.out.println("index of specific values is :"+count);






	//	System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
