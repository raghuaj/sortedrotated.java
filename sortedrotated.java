package com.raghu;

import java.util.Scanner;
public class Main {


     public static int binarysearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = low + high / 2;
            if (a[mid] == key)
                return key;

            if (a[low] < a[mid]) {
                if (key >= a[low] && key < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > a[mid] && key <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }


        }
        return -1;
    }








    public static void main(String[] args) {

	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    int[] a= new int [n];
	    for(int i=0;i<n;i++)
	        a[i]=input.nextInt();
	    int key= input.nextInt();
        System.out.println(binarysearch(a,key));


    }


    }
