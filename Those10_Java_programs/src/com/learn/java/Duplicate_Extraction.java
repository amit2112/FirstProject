package com.learn.java;

import java.util.ArrayList;

public class Duplicate_Extraction {

	String arr[] = {"a","b","a","b","c","c","d"};
	ArrayList<String> list = new ArrayList<String>();
	public void findDuplicate(){
		int temp=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i].equals(arr[j])){
					temp+=1;
						//System.out.println("Number of repeatition is "+temp+" ==> "+" Repeated element is: "+arr[i]);
						list.add(arr[i]);
					}
				}
			}
		System.out.println("No. of repeatition is : "+temp);
		System.out.print("Repeated elements are : ");
		for(String k:list){
			System.out.print(k+" ");
		}
	}
	
	public static void main(String args[]){
		Duplicate_Extraction obj = new Duplicate_Extraction();
		obj.findDuplicate();
	}
}
