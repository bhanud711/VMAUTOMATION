package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("rama");
al.add("krishna");
al.add("gopi");
al.add("hari");
System.out.println(al);
al.add("krishna");
al.add("murali");
System.out.println(al);
Iterator<String> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println(al.get(4));
	}

}
