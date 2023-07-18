package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs=new HashSet<String>();
hs.add("rama");
hs.add("krishna");
hs.add("gopi");
hs.add("hari");
System.out.println(hs);
hs.add("krishna");
hs.add("murali");
System.out.println(hs);
Iterator<String> it = hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
