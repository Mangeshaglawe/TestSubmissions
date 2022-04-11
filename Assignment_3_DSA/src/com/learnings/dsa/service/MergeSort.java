package com.learnings.dsa.service;

public class MergeSort {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,5,12,10,9,1,8};
		
		MergeSort obj = new MergeSort();
		System.out.println("original array");
			
		display(arr);
		
		obj.mergesort(arr,0,arr.length -1);
		System.out.println("Sorted array...!");
		display(arr);
	}*/

	public void mergesort(Integer[] arr, int left, int right) {
		// TODO Auto-generated method stub
		
		if(left < right) {
			int mid = (left + right)/2;
			mergesort(arr, left, mid);
			mergesort(arr, mid+ 1, right);
			
			merge(arr,left,mid,right);
		}
		
	}

	private void merge(Integer[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int len1 = mid - left + 1;
		int len2 = right- mid;
		
		int leftarr[] = new int[len1];
		int rightarr[] = new int[len2];
		
		for(int i = 0 ; i <len1 ; i ++) {
			leftarr[i] = arr[left + i];
		}
		for(int j = 0 ; j <len2 ; j ++) {
			rightarr[j] = arr[mid + 1+ j];
		}	
		
		int i,j,k;
		i = 0;
		j = 0;
		k = left;
		
		while (i < len1 && j < len2) {
			if(leftarr[i] <= rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
			}else { arr[k] = rightarr[j];
			j++;
			}
			k++;
		}
		
		while(i < len1) {
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while(j < len2) {
			arr[k] = rightarr[j];
			j++;
			k++;
		}
		
	}

	public void display(Integer[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i = 0 ; i < n;i++) {
			System.out.print(arr[i] + "   ");
			System.out.println();
		}
		
	}

}
