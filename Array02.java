// Write a Java program to sum values of an array. 
import java.util.Scanner;
class Array02 {
static private int n;
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
System.out.println("sum of the array values :"+sum);






		//System.out.println("Hello World!");
	}
}
