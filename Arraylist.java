package sebone2;
import java.util.*;

public class Arraylist {
	public static void main(String []args) {
		
		List<Integer>name=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
//		name.add("Mohit");
//		name.add("Singh");name.add("Rajputt");name.add("Rohit");
//		System.out.println(name);
//		name.add("Raju");
//		name.add(1,"Devendra");
//		List<String>name1=new ArrayList<String>();
//		
//		name1.add("Raju121");
//		name1.add("Raju12121");
//name.addAll(name1);
//		
//		System.out.println(name);
//		
//		name.remove(0);	
//		name.clear();
//		System.out.println(name);
//	
		//name.remove(String.valueof("Mohit"));
		name.add(121);
		name.add(122);
		name.add(123);
		name.add(124);
		name.set(0, 125);
		//System.out.println(name);
		//System.out.println(name.contains(500));
		for (Integer i : name) {
			System.out.println("The Array Element is"+i);
		}
		Iterator<Integer>it=name.iterator();
		while(it.hasNext())
		{
			
			System.out.println("Iterator"+it.hasNext());
		}
		
	}

}
