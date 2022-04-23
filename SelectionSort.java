class SelectionSort {
static private int min;
static private int i,j;
static private int n;
static private int temp;
	public static void main(String[] args) {
	int arr[]={7,4,10,8,3,1};
	n=6;
for(i=0;i<n-1;i++){
min=i;
for(j=i+1;j<n;j++){
if(arr[j]<arr[min]){
temp=arr[min];
arr[min]=arr[j];
arr[j]=temp;
}
}
}
for(int k=0;k<n;k++){
System.out.println(arr[k]);
}

		//System.out.println("Hello World!");
	}
}
