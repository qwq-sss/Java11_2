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
		for(int i = 2;m > 1; i++)//�ҳ�m������Լ����1��m����
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
		for(int i = 0; i< list.size(); i++)//��m��Լ����ɸѡ����ż���ε����ݶ�ȥ���������ε�����ֻ��һ����
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
		for(int i=0;i<list.size();i++)//�������ε�������˵�n
		{
			mul*=list.get(i);//list����ͨ��get���õ��������ݣ���Ϊ���涨���Ϊint���ͣ����Կ���ֱ�ӵ�����ͨ�����н���ʹ��
		}
		return mul;
	}

}

