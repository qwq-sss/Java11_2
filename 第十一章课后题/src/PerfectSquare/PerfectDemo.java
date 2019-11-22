package PerfectSquare;

import java.util.ArrayList;

import java.util.Scanner;

public class PerfectDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,M;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m:");
		m = input.nextInt();
		M = m;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i = 2;m > 1; i++)//找出m的所有约数，1和m除外
		{
			if(m % i==0)
			{
				list.add(i);
				m = m / i;
				i = 1;
			}
		}
		n = yin(list);
		System.out.println("The smallest number n for m * n to be a perfect square is "+n+"\n m * n is "+ M*n);
	}
	public static int yin(ArrayList<Integer> list)
	{
		int mul = 1;
		ArrayList<Integer> List = new ArrayList<Integer>();
		for(int i = 0; i< list.size(); i++)//将m的约数集筛选，把偶数次的数据都去除，奇数次的数据只留一个。
		{
			for(int j = i+1; j < list.size(); j++)
			{
				if(list.get(i) == list.get(j))
				{
					list.remove(j);
					list.remove(i);
					j--;
				}
				else
				{
					continue;
				}
			}
		}
		for(int i=0;i<list.size();i++)//把奇数次的数据相乘得n
		{
			mul*=list.get(i);//list方法通过get来得到其中数据，因为上面定义的为int类型，所以可以直接当作普通的数列进行使用
		}
		return mul;
	}

}

