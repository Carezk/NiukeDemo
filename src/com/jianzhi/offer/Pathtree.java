package com.jianzhi.offer;

import java.util.ArrayList;

public class Pathtree {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(5);
		TreeNode node3=new TreeNode(6);
		TreeNode node4=new TreeNode(9);
		root.left=node1;
		root.right=node2;
		node1.left=node4;
		node2.right=node3;
		Pathtree pos=new Pathtree();
		ArrayList<ArrayList<Integer>> arr=pos.FindPath(root,14);
		System.out.println(arr);
	}
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(root==null) return arr;
        int sum=0;
        path(root,target,arr,list,sum);
        return arr;
    }
	public void path(TreeNode root,int target,ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> list,int sum) {
		if(root==null) return ;
        sum+=root.val;//每次更新sum值
        if(root.left==null&&root.right==null) {//走到叶结点，进行判断
            if(sum==target)
                { 
            		list.add(root.val);//都得将这个值加入list
            		arr.add(new ArrayList<Integer>(list));
            		list.remove(list.size()-1);//移除最后一个元素，深度遍历完一条路径后要回退
                }
          return ;  
        }
        //未走到叶结点时候处理 
        list.add(root.val);//在list里面加入该结点
        path(root.left,target,arr,list,sum);
        path(root.right,target,arr,list,sum);
        list.remove(list.size()-1);//移除最后一个元素，深度遍历完一条路径后要回退
	}
}