import java.util.*;
import java.io.*;

class QuickSort{
	void quickSort(int arr[],int low,int high){
		if(low<high){
		int pIndex=partition(arr,low,high);
		quickSort(arr,low,pIndex-1);
		quickSort(arr,pIndex+1,high);
		}
	}
	int partition(int arr[],int low,int high){
		int pivot=arr[low];
		int i=low;
		int j=high;

		while(i<j){
			while(arr[i]<=pivot && i<=high-1){
				i++;
			}
			while(arr[j]>pivot && j>=low+1){
				j--;
			}
			if(i<j)swap(arr,i,j);
		}
		swap(arr,low,j);
		return j;
	}
	void swap(int arr[],int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}
class Run{
	public static void main(String[] args){
		QuickSort q=new QuickSort();
		int arr[]={5,4,2,9,1,7,8};
		q.quickSort(arr,0,arr.length-1);
		for(int i : arr){
			System.out.println(i);
		}
	}
}