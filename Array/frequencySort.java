/* 
Code Pair problem:
Given a text containing words, spaces, new lines and punctuations, 
Print the frequency of each word ignoring capitalization in order of frequency.

Sample input: "The quick brown fox, jumped over the brown log. The slow red fox did not."

output:
the: 3
brown: 2
fox: 2
over: 1
red: 1
quick: 1
not: 1
slow: 1
log: 1
jumped: 1
did: 1

*/

import java.util.*;
import java.util.Map.Entry;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "The quick brown fox, jumped over the brown log. The slow red fox did not.";
       printWordCount(input);
	}
	public static void printWordCount(String s){
		
		int count=0;
		String[] words = s.split("\\W+");
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<words.length;i++){
			String insert = words[i].toLowerCase();
			if(!map.containsKey(insert)){
				map.put(insert, 1);
			}
			else{
				count = map.get(insert);
				map.put(insert, ++count);
			}
		}
	
		Set<Entry<String, Integer>> entries = map.entrySet();
		Comparator <Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>(){
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2){
				int s1 = e1.getValue();
				int s2 = e2.getValue();
				if( s1>s2)
					return -1;
				else
					return 1;
			}
		};
		List<Entry<String, Integer>> sortList =  new ArrayList<>(entries);
		
		Collections.sort(sortList, valueComparator);
	
		LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<>(sortList.size()); // copying entries from List to Map 
		for(Entry<String, Integer> entry : sortList){ 
			sortedByValue.put(entry.getKey(), entry.getValue()); 
		} 

		Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet(); 
		
		for(Entry<String, Integer> mapping : entrySetSortedByValue){ 
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}	
	}
}
