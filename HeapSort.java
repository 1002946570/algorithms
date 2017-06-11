package algorithms;

public class HeapSort {
	static int heapsize;
	public static void MaxHeapify(int[] a, int i){
		int l = i * 2, r = i * 2 + 1, largest = i, k;
		if(l < heapsize && a[l-1] > a[i-1]){
			largest = l;
		}
		if(r < heapsize && a[r-1] > a[i-1]){
			largest = r;
		}
		if(largest != i){
			k = a[i-1];
			a[i-1] = a[largest-1];
			a[largest-1] = k;
			System.out.println(largest);
			MaxHeapify(a,largest);
		}
		
	}
	public static void BuildMaxHeap(int[] a){
		for(int i = (heapsize)>>1; i >= 1; i--){
			MaxHeapify(a,i);		
		}
	}
	public static void main(String[] args) {
		int[] a = {5,8,32,1,56,45,89,75};
		int exchange;
		heapsize = a.length;
		HeapSort.BuildMaxHeap(a);
		for(int j = a.length-1; j >= 1; j--){
			exchange = a[j];
			a[j] = a[0];
			a[0] = exchange;
			heapsize--;
			MaxHeapify(a,1);
		}
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+",");
		}
	}

}
