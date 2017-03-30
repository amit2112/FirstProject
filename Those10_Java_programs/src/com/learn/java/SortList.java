package com.learn.java;

import java.util.ArrayList;

public class SortList {
	
	ArrayList<String> list = new ArrayList<String>();
	public void setValue(){
		list.add("5");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("1");
		
		/*for(String i: list){
			System.out.println("Elements are: "+i);
		}*/
		for(int i=0; i<list.size(); i++){
			for(int j=i+1; j<list.size(); j++){
				
			}
		}
		
	}
	
	public static void main(String args[]){
		SortList obj = new SortList();
		obj.setValue();
	}

}
