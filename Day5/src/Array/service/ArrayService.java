package Array.service;

import java.util.Scanner;

public class ArrayService {

	public static int addAllElement(int[][] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		return sum;
	}

	public static int[][] rotateRowWise(int[][] arr, int n) {
		// TODO Auto-generated method stub
		int[]temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
	arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}

	public static void displayData(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void acceptData(int[][]arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	}

}
