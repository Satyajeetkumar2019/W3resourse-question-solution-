// Write a Java program to calculate the average value of array elements
import java.util.Scanner;
class Array03 {
static private int n;
static private double avg;
static private int sum;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=scn.nextInt();
}//end for 

for(int i=0;i<n;i++){
sum=sum+arr[i];

}
System.out.println("Average  of the array values :"+sum/n);





		//System.out.println("Hello World!");
	}//end of the main methodn 
}//end of the class
