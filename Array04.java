//Write a Java program to test if an array contains a specific value
import java.util.Scanner;
class Array04 {
static private int n;
static private int m;
static private int count;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	n=scn.nextInt();
	System.out.println("Enter the array  calues :");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=scn.nextInt();
}
System.out.println("Enter the specific values :");
m=scn.nextInt();
for(int i=0;i<n;i++){
if(m==arr[i]){
	count++;
	break;
	}
}
if(count==1)
	System.out.println("Yes ");
	else
System.out.println("No ");
		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the clas
