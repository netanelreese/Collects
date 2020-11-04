import java.util.ArrayList;

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
		System.out.println("Tree Map of Torah Portions in alphabetical order");
		hashTorah.printTree();
	}

}
