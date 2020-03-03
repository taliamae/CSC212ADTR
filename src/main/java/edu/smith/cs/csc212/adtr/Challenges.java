package edu.smith.cs.csc212.adtr;

import java.util.Objects;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

// Wow, this class really needs some comments...
public class Challenges {

	public static SetADT<String> union(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String l : left) {
			output.insert(l);
		}
		for (String r : right) {
			output.insert(r);
		}
		
		return output;
	}
	
	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String items : left) {
			if (right.contains(items)) {
				output.insert(items);
			}
		}
		
		return output;
	}
	
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		int count = 0;
		for (int i=0; i<words.size(); i++) {
			if (output.getKeys().equals(words)) {
				count += 1;
				output.put(words.getIndex(i), count);
			} else {
				output.put(words.getIndex(i), 1);
			}
		}
		
		
		return output;
	}
}
