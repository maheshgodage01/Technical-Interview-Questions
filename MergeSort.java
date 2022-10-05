import java.util.Scanner;

public class MergeSort {
    void merge(int arr[], int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

        int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int left, int right)
	{
		if (left < right) {
			int mid = left + (right - left) / 2;

			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		MergeSort ob = new MergeSort();

		int n=input.nextInt();
		for(int j=0;j<n;j++){
			int l=input.nextInt();
			int[] arr=new int[l];
			for(int i=0;i<l;i++){
				arr[i]=input.nextInt();
			}
			ob.sort(arr, 0, arr.length - 1);
			System.out.println("\nSorted array");
			printArray(arr);
		}

		// System.out.println("Given Array");
		// printArray(arr);
	}
    
}
