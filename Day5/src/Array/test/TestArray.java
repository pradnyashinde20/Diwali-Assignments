package Array.test;

import java.util.Scanner;

import Array.service.ArrayService;

public class TestArray {
	public static void main(String agrs[]) {
Scanner sc=new Scanner(System.in);
int[][] arr=new int[3][3];
//int [][] arr1=new int[3][3];
ArrayService.acceptData(arr);
ArrayService.displayData(arr);

int choice;
do{
	System.out.println("1.add all no\n2.rotatematrix rowwise\n3.display\n4.exit\nchoice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	{
		int sum=ArrayService.addAllElement(arr);
		System.out.println("addition all element:"+sum);
		break;
	}
	case 2:
	{
		System.out.println("enter the no of rotation:");
		int n=sc.nextInt();
		int [][]rotate=ArrayService.rotateRowWise(arr,n);
		ArrayService.displayData(rotate);
		break;
		
	}
	case 3:
	{
		ArrayService.displayData(arr);
		break;
	}
	case 4:
	{
		System.out.println("thank you");
		break;
	}
	default:{
		System.out.println("wrong choice");
	}
	}
	}while(choice!=5);

}
}

