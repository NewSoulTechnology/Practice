package com.self.day_one;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求出最大或最小值
         int[] array=new int[]{3,6,7,3,5,1,2,6};
         int max=array[0],min=array[0];
         for(int i=0;i<array.length;i++){
        	 if(max<array[i]){
        		 max=array[i];
        	 }
         }
         for(int i=0;i<array.length;i++){
        	 if(min>array[i]){
        		 min=array[i];
        	 }
         }
         System.out.print("max_value:"+max);
         System.out.println(" min_value:"+min);
         //求出1！*2！...一直 10！ 的和 是多少
         long sum=0,temp=1;
         for(int i=1;i<=10;i++){
        	 for(int j=1;j<=i;j++){
        		 temp*=j;
        	 }
        	 sum+=temp;temp=1;
         }
         System.out.println("1!+2!+...10!:"+sum);
         //100元买100只鸡  ,公鸡9元2只  母鸡 3元一只 ,小鸡1元5只   每种至少1只  ,求出有多少种组合
         int count=0;
         for(int i=1;i<(int)(100/9*2);i++){
        	 for(int j=1;j<(int)(100/3);j++){
        		 for(int k=0;k<(int)(100/1*5);k++){
        			 if(i*45+j*30+k*2==1000&&(i+j+k)==100){
        				 count++;
        				 System.out.printf("公鸡%d只，母鸡%d只，小鸡%d只%n",i,j,k);
        			 }
        		 }
        	 }
         }
         System.out.printf("共有%d种",count);
	}

}
