package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringArraylist {

	public static void main(String[] args) {
		List<String>str=new ArrayList<String>();
		str.add("virat");
		str.add("shikhar");
		str.add("rohit");
		str.add("hardik");
		str.add("chahal");
		
		//simple way 
System.out.println("print in a simple way---------------------");
        System.out.println(str);

//Traditional for loop
        System.out.println("in traditional for loop---------------");
        for(int i=0;i<str.size();i++)
        	System.out.println(str.get(i));

//Enhanced or advanced for loop
        System.out.println("enhanced for loop-------------------");
        for(String x:str)
        	System.out.println(x);
//print using iterator
        System.out.println("using simple iterator-------------");
      Iterator<String> iter=str.iterator(); 
        while(iter.hasNext())
        	System.out.println(iter.next());
        
        //using listiterator
        System.out.println("print using forword list iterator-----------------------");
        ListIterator<String>iter1=str.listIterator();
        while(iter1.hasNext())
        	System.out.println(iter1.next());
        
        System.out.println("print using bck forword-----------------------------");
        
        while(iter1.hasPrevious())
        	System.out.println(iter1.previous());
        
        
        //starts between 
        System.out.println("starts between-----------");
        Iterator<String>iter2=str.iterator();
        if(iter2.hasNext())
        {
        	iter2.next();
        	//iter2.next();
        
        }while(iter2.hasNext())
        	
        	System.out.println(iter2.next());
        
    }

}
