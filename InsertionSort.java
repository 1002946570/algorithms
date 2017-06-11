package algorithms;

public class InsertionSort {

	public static void insertionSort(int[] a){
		int i,j,key;
		for(i = 1;i < a.length;i++){
			key = a[i];
			j = i - 1;
			while(j >= 0 && key < a[j]){
				a[j+1] = a[j];
				a[j] = key;
				j--;
			}
		}
		for(i = 0;i < a.length;i++){
			System.out.print(a[i]+",");
		}
	}
	
	public static void main(String arg[]){
		int[] a = {5,8,32,1,56,45,89,75}; 
		insertionSort(a);
	}
}
