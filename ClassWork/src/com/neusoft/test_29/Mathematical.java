package com.neusoft.test_29;

import java.util.Scanner;

public class Mathematical {
	   public static void main(String[] args){
	   int i=1;
	    /*while(i<101){
	            boolean t=false;
	            for (int j=2;j<i;j++){//当i>2的时候就需要判断i是否为质数
	                if (i%j==0)//如果算i不能被循环里的数整除，然后输出，那么会有很多能被整除的数被忽略
	                    t=true;//质数不应能被里面的任何一个数整除，如果可以那么记录下来，如果没有那么就是它
	                //如果求第一个加上break;
	            }
	            if (t==false)
	                System.out.println(i);
	            i++;
	        }*/
	    /*for (int i=1;i<101;i++)
	    {
	        boolean T=false;
	        for (int j=2;j<i;j++){
	            if (i%j==0){
	                T=true;
	            }
	        }
	        if (T==false){
	            System.out.println(i);
	        }
	    }*/
	    //1小题
	    int sum=0;
	    while (i<101){
	        if (i%2!=0){
	            //System.out.println(i);
	            sum+=i;
	        }
	        i++;
	    }
	    System.out.println(sum);
	    //2小题
	    sum=1;
	    for (i=1;i<6;i++)
	        sum*=i;
	    System.out.println(sum);
	    //3小题
	        for (i=1;i<8;i++){
	            for (int j=1;j<6;j++)
	                System.out.print("_|");
	            System.out.println();
	        }
	        //4小题
	        int[] arr1={1,0,7,3,6,8};
	        int[] arr2={0,5,1,1,5,4,3,2,0,2,1};
	        //5小题
	        //Scanner scanner=new Scanner(System.in);
	        sum=0;
	        for (i=0 ;i<arr2.length;i++)
	            sum+=arr2[i];
	        System.out.println(sum);
	        for (i = 0; i < arr2.length; i++){
	            if (arr2[0] < arr2[i])//Max
	                arr2[0] = arr2[i];
	            if (arr2[arr2.length-1]>arr2[i])//Min
	                arr2[arr2.length-1]=arr2[i];
	        }
	            System.out.println("最大值"+arr2[0]);
	            System.out.println("最小值"+arr2[arr2.length-1]);
	            System.out.println("平均值"+(double)sum/arr2.length);
	    }
	}
