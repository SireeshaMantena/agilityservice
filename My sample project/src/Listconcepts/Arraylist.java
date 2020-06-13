package Listconcepts;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		/* int a[]=new int[3]; a[0]=1; */
		 
		  ArrayList ar = new ArrayList();
		 
		
ar.add(10);

ar.add(20);

ar.add(30);
ar.add(50);

System.out.println(ar.size());
		
		 
for (int i=0;i< ar.size();i++)
{
	System.out.println(ar.get(i));
}
		 
	}

}
