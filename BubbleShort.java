import java.util.Scanner;
class BubbleShort {
static private int temp;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the length of an arrry:");
	int n=scn.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=scn.nextInt();
	}
//sorting the array values 
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1;j++){
	if(arr[j]>arr[j+1]){
	temp=arr[j];
	arr[j]=arr[j+1];
		arr[j+1]=temp;
	}//end of the if block
}//end of the inner for loop
}//end for loop
System.out.println("After the sorting element of an array :");
for(int i=0;i<n;i++){
System.out.println(arr[i]);

}



		System.out.println("Hello World!");
	}
}
