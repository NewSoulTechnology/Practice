package com.self.day_one;

public class BaseOperators {
/**
 * 基本运算符
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9,b = 4;
		double c=6;
		int a1 = 9,b1 = 4;
		double c1=6;
		int d=10,d1;
		//==================算术运算符========================
		//算数符 +
         System.out.println(a+b);//结果13
       //算数符 -
         System.out.println(a-b);//结果5
       //算数符 *
         System.out.println(a*b);//结果36
       //算数符 /
         System.out.println(a/b);//结果2
         System.out.println(a/c);//结果1.5
       //算数符 %
         System.out.println(a%b);//结果1
         System.out.println(a%c);//结果3.0
       //==================递增、递减运算符====================
       //算数符 ++
         System.out.println(a++);//结果9
         System.out.println(++a);//结果11
         //“++a+b+++c++”等价于“(++a)+(b++)+(c++)”,利用堆栈辅助分析
         System.out.println(++a+b+++c++);//结果22.0
       //算数符 --
         System.out.println(a1--);//结果9
         System.out.println(++a1);//结果9
         //“--a1-b1---c1--”等价于“(--a1)-(b1--)-(c1--)”
         System.out.println(--a1-b1---c1--);//结果-2.0
       //==================赋值运算符=========================
       //算数符 =
         System.out.printf("%d%n",d1=d);//结果10
       //==================比较、条件运算符====================
       //算数符 >、>=、==、<=、<、!=
         System.out.println(d==d1);//结果true
       //==================逻辑、位或运算符====================
       //算数符 ||、&&、！、|、&、       、、、、
	}

}
