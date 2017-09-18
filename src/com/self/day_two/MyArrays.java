package com.self.day_two;

public class MyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//动态声明一维数组
        int[] array_1=new int[10];
        System.out.println("===动态声明一维数组===");
        for (int i : array_1) {
			System.out.print(i+" ");
		}
        System.out.println();
        //静态声明一维数组
        double[] array_2=new double[]{1,2,3,4,5,6};
        System.out.println("===静声明一维数组===");
        for (double i : array_2) {
        	System.out.print(i+" ");
		}
        System.out.println();
        //二维数组
        //动态声明等长二维数组
        int[][] Darray_1=new int[4][8];
        System.out.println("===动态声明等长二维数组===");
        for (int[] is : Darray_1) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
        //动态声明不等长二维数组
        int[][] Darray_2=new int[3][];
        Darray_2[0]=new int[10];
        Darray_2[1]=new int[7];
        Darray_2[2]=new int[9];
        System.out.println("===动态声明不等长二维数组===");
        for (int[] is : Darray_2) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
        //静态声明等长二维数组
        int[][] Darray_3={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("===静态声明等长二维数组===");
        for (int[] is : Darray_3) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
        //静态声明不等长二维数组
        int[][] Darray_4={{1,2,3},{4,5},{6,7,8}};
        System.out.println("===静态声明不等长二维数组===");
        for (int[] is : Darray_4) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
