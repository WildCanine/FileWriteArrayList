package array;
import java.util.ArrayList;
public class Sort {
	public int[] bubbleSort(int[] list) {
		int a, b, temp=0;
		for (a=0; a<list.length-1; a++) {
			for (b=0; b<list.length-1-a; b++) {
				if (list[b]<list[b+1]) {
					temp=list[b];
					list[b]=list[b+1];
					list[b+1]=temp;
				}
			}
		}
		return list;
	}
	public int[] insertionSort(int[] list) {
		int i, j, key, temp;
		for (i=1; i<list.length; i++) {
			key=list[i];
			j=i-1;
			while (j>=0 && key>list[j]) {
				temp=list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
			}
		}
		return list;
	}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
		int i, j, key, temp;
		for (i=1; i<list.size(); i++) {
			key=list.get(i);
			j=i-1;
			while (j>=0 && key>list.get(j)) {
				temp=list.get(j);
				list.set(j, list.get(j+1));
				list.set(j+1, temp);
			}
		}
		return list;
	}
	private int[] array;
    private int[] tempMergArr;
    private int length; 
    public void mergeSort(int inputArr[]) {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergArr=new int[length];
        doMergeSort(0, length-1);
    } 
    private void doMergeSort(int lowerIndex, int higherIndex) {         
        if (lowerIndex>higherIndex) {
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle+1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    } 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) { 
        for (int i=lowerIndex; i<=higherIndex; i++) {
            tempMergArr[i]=array[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while (i<=middle && j<=higherIndex) {
            if (tempMergArr[i]<=tempMergArr[j]) {
                array[k]=tempMergArr[i];
                i++;
            } else {
                array[k]=tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle) {
            array[k]=tempMergArr[i];
            k++;
            i++;
        } 
    }
    public void quickSort(int arr[], int begin, int end) {
        if (begin<end) {
            int partitionIndex=partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot=arr[end];
        int i=(begin-1);
     
        for (int j=begin; j < end; j++) {
            if (arr[j]<=pivot) {
                i++;
                int swapTemp=arr[i];
                arr[i]=arr[j];
                arr[j]=swapTemp;
            }
        }
        int swapTemp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=swapTemp;
        return i+1;
    }
    public int[] selectionSort(int[] arr){  
        for (int i=0; i<arr.length-1; i++) {
            int index=i;  
            for (int j=i+1; j<arr.length; j++){  
                if (arr[j]>arr[index]){  
                    index=j;  
                }
            }
            int smallerNumber=arr[index];   
            arr[index]=arr[i];  
            arr[i]=smallerNumber;  
        }
        return arr;
    }
}
