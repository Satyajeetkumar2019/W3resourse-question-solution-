class InsertionSort {
static private int key;
static private int i,j;
static private int n;
	public static void main(String[] args) {
	int arr[]={7,3,5,4,2,6};
	n=6;
for(i=1;i<n;i++){
j=i-1;
key=arr[i];
while(j>=0&&arr[j]>key){
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
for(int k=0;k<n;k++){

System.out.println(arr[k]);
}

	//	System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
