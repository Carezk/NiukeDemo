package com.niuk.demo;

import java.util.Scanner;

/*����������� 1��5��10��20��50��100 Ԫ��ֽ�ң�
 ����ÿ�ֱ�ֵ���������㹻�࣬��д���������NԪ��NΪ0~10000�ķǸ��������Ĳ�ͬ��ϵĸ�����*/
import java.util.Scanner;
public class coinDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int[] m = {1, 5, 10, 20, 50, 100}; // ���������������
        long[] data = new long[num+1]; // ����������ݵ�����
        for(int i = 0; i <= num; i++) // �߽�����A(n,1) = 1 (n>=0)
            data[i] = 1;
        for(int i = 1; i < 6; i++) // ��������5��ʼ����Ϊ1Ԫ����������ʼ��ʱ�Ѿ�д����
            for(int n = 1; n <= num; n++) // n��1��ʼ����֤�˱߽�����A(0,m)=1 (m=1,5,10,20,50,100)
                if(n >= m[i])
                    data[n] += data[n - m[i]]; // ״̬ת�Ʒ���
        System.out.println(data[num]);
        in.close();
    }
}