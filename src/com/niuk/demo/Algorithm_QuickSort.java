package com.niuk.demo;

/**
 * ��������(�ڿ�����+���η���
 * @author JiaJoa
 * ͨ������һ��������������е�һ����׼λ�ã�һ���Ե�һ����Ϊ��׼����
 * ʹ�û�׼��ߵĶ�С�������׼����׼�ұߵĶ������������
 * Ȼ��ʹ�õݹ�ȷ�������������ִ��ͬ���Ŀ�������
 *
 */
public class Algorithm_QuickSort {
    public static void main(String[] args){
        int[] data = new int[]{7,1,6,4,3,2,1,23};
        
        Algorithm_QuickSort.quickSort(data); 
    }
    
    //��һ��������һ����׼λ
    public  static int getPart(int low,int high,int[] data){
        
        int comData = data[low]; //�趨һ����ʼ��׼
        while(low<high){
            while(low<high&&data[high]>=comData){//�����������
                high--;
            }
            if(low<high){
                data[low] = data[high]; //С�ڻ�׼���Ƶ��Ͷ�
            }
            
            while(low<high&&data[low]<=comData){ //�������Ҳ���
                low++;
            }
            if(low<high){
                data[high]=data[low]; //���ڻ�׼���Ƶ��߶�
            }
        }
        data[low] = comData; //��׼λ�ò��ٱ仯ʱ
        return low;
    }
    
    //�ڶ��������õݹ�ķ�ʽ�����׼��������
    public static void quick_Recursion(int low,int high,int[]data){
        
        int base;
        if(low<high){
            base = getPart(low,high,data);//��ȡ��׼
            quick_Recursion(low,base-1,data);//�Եͻ�׼λ�ν��еݹ�����
            quick_Recursion(base+1,high,data);//�Ը߻�׼λ�ν��еݹ�����
        }
    }
    
    //����������ӡ���������
    public static void quickSort(int[] data){
        quick_Recursion(0,data.length-1,data);
        
        StringBuilder playnum = new StringBuilder();
        for(int i : data){
            playnum.append(i+",");
        }
        System.out.println(playnum.toString());
    }
}
