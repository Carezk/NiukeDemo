package com.niuk.demo;

/*����һ��Ǹ�������ɵ�����h������һ����״ͼ�ĸ߶ȣ�����ÿ�����ӵĿ�ȶ�Ϊ1�� ��������״ͼ���ҵ�����ɵ������ε��������ͼ��ʾ���� 
���hΪһ���������飬����ÿ�����ӵĸ߶ȣ����������ֵ��*/
import java.util.Scanner;

public class Area {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i =0;i<n;i++){
            height[i] = sc.nextInt();
        }

        int maxArea = -1;
        for(int i = 0;i<n;i++){
            int left=i;
            int right=i;

          //�����Ե�ǰֵΪ��С�߶ȵľ������
            while(left > 0 && height[left-1] >= height[i])  left--;//Ѱ����߽�
            while(right < n-1 && height[right+1] >= height[i])  right++;//Ѱ���ұ߽�
            int tempArea = (right-left+1) * height[i];

            if(maxArea<tempArea) maxArea=tempArea;
        }

        System.out.println(maxArea);
    }

}
