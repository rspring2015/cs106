import java.util.*;
public class main {
	
		public static void main(String[] args) {
			//create arraylist
			
		ArrayList<String> Numbers
		=new ArrayList<String>();
		
		//add
		ArrayList<String> list= new ArrayList <String>();
		list.add("one");
		list.add("two");
		list.add("ten");
		
		
		//print using foreach
		
		for (String s : list) {
			System.out.println(s);
		}
		
		//LinkedList print using iterator
		
		LinkedList<String> myList= new LinkedList<String> ();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		
		Iterator<String> i = myList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		//LinkedList foreach
			for (String s: myList) {
				System.out.println(s);
			}
		//Tree Set	iterator
		TreeSet<String> mySet = new TreeSet<String>();
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		
		
		Iterator<String>i = mySet.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
			
		}
		
		//Tree Set foreach
		for (String s : mySet) {
			System.out.println(s);
		}
		
			}
		
		
		
		}
}
