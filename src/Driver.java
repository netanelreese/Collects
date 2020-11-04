import java.util.ArrayList;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> notes = new ArrayList<Integer>();
		//Integer[] notes2 = new Integer[10];
		// both can have null and duplicate elements
		//both unordered
		//use index to access
		// ARraylist cannot use primitive types
		//deck list queue and set...no beans
		//AbstractList, AbstractQueue, AbstractSet, ArrayDecque, ArrayList, EnumSet, HashSet, 
		//LinkedList, Stack, TreeSet, Vector???
		
		//ArrayList<Number> nodes = new ArrayList<Number>();
		//ArrayList<Number> nodesRef = new ArrayList<Number>();
		
		//iterators!!! cry about it
		
		
		// Assignment time
		
		//Set to find unique elements in a list
		ArrayList<Jews> jewList = new ArrayList<Jews>();
		jewList.add(new Jews("Netanel"));
		jewList.add(new Jews("Moshe"));
		jewList.add(new Jews("Moshe"));
		jewList.add(new Jews("Moshe"));
		jewList.add(new Jews("Rabbi Ovadia"));
		jewList.add(new Jews("Jerry Seinfeld"));
		jewList.add(new Jews("Netanel"));
		jewList.add(new Jews("Sarah"));
		jewList.add(new Jews("Sarah"));
		jewList.add(new Jews("Sarah"));
		jewList.add(new Jews("Spencer"));
		jewList.add(new Jews("Kasi"));
		jewList.add(new Jews("Zack"));
		System.out.println("Too many Moshe's!!");
		for(int i = 0; i < jewList.size(); ++i) {
			System.out.println(jewList.get(i).getName());
		}
		System.out.println("\n");
		HashSet<Jews> uniqueJews = new HashSet<Jews>(jewList);
		
		System.out.println("Now we have some unique Jews");
		for (Jews jews : uniqueJews) {
			System.out.println(jews.getName());
		}
		System.out.println("\n");
		
		// HashMap v. TreeMap
		ArrayList<String> parshat = new ArrayList<String>();
		parshat.add("Bereshit");
		parshat.add("Noach");
		parshat.add("Lech-Lecha");
		parshat.add("Vayeira");
		parshat.add("Chayei Sara");
		parshat.add("Toledot");
		
		ParshatTorah hashTorah = new ParshatTorah(parshat);
		System.out.println("Hash map of Torah Portions unsorted:");
		hashTorah.printHash();
		System.out.println("\n");
		System.out.println("Tree Map of Torah Portions in alphabetical order");
		hashTorah.printTree();
		System.out.println("\n");
		//Use tree map if organizing by value in ascending order or in ascending alphabetical order
		//HashMap is really if you know the keys and where they are
	}

}
