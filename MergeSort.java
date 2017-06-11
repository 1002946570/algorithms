package algorithms;

public class MergeSort {
	public static void merge(int[] a, int p, int q, int r){
		int i = p, j = q+1, k = 0, n = p;
		int[] tmp = new int[r-p+1];
		while(i <= q && j <= r){
			if(a[i] >= a[j]){
				tmp[k] = a[j];
				j++;
			}else{
				tmp[k] = a[i];
				i++;
			}
			k++;
		}
		if(i > q && j <= r){
			while(j <= r){
				tmp[k] = a[j];
				j++;
				k++;
			}
		}
		if(i <= q && j > r){
			while(i <= q){
				tmp[k] = a[i];
				i++;
				k++;
			}
		}
			
		for(int m = 0; m <= k - 1; m++){
			a[n] = tmp[m];
			n++;
			
		}
	}
	
	public static void mergeSort(int[] a, int p, int r){
		if(p != r){
			int q = (p + r)/2;
			MergeSort.mergeSort(a, p, q);
			MergeSort.mergeSort(a, q+1, r);
			MergeSort.merge(a, p, q, r);
		}
	}
	
	public static void main(String[] args){
		int[] a = {5,8,32,1,56,45,89,75};
		int r = a.length-1;
		int p = 0;
		MergeSort.mergeSort(a, p, r);
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+",");
		}
	}	
}
