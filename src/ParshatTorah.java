import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class ParshatTorah {
	private HashMap<String, Integer> parshatTorah;
	private TreeMap<String, Integer> parshatTree;
	
	public ParshatTorah(ArrayList<String> parshat) {
		parshatTorah = new HashMap<String, Integer>(toHashMap(parshat));
		parshatTree = new TreeMap<String, Integer>(parshatTorah);
	}
	public void printHash() {
		for (String parshat : parshatTorah.keySet()) {
			System.out.println(parshat + ":" + parshatTorah.get(parshat));
		}
	}
	public void printTree() {
		for (String parshat : parshatTree.keySet()) {
			System.out.println(parshat + ":" + parshatTree.get(parshat));
		}
	}
	private HashMap<String, Integer> toHashMap(ArrayList<String> inputArray) {
		HashMap<String, Integer> output = new HashMap<String, Integer>();
		
		for (int i = 0; i < inputArray.size(); ++i) {
			output.put(inputArray.get(i), i + 1);
		}
		
		return output;
	}
}

