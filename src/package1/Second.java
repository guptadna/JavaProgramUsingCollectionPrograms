package package1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Second {
/*
	input = 1 1 1 2 2 1
	output= 3 1 2 2 1 1	  //occurrence value
	*/	
	
	public static ArrayList<Integer> problem2(ArrayList<Integer> inputArrayList){
		LinkedHashMap<Integer, ArrayList<Integer>> linkedHashMap = new LinkedHashMap<>();
		
//		ArrayList<Integer> arrayLsit =new ArrayList<>();
//		arrayLsit.add(1);
//		arrayLsit.add(1);
//		arrayLsit.add(1);
//		arrayLsit.add(2);
//		arrayLsit.add(2);
//		arrayLsit.add(1);
		
		ArrayList<Integer> arrayLsit = inputArrayList;
		System.out.println("input : " + arrayLsit.toString());
		ArrayList<Integer> tempArrayList = new ArrayList<>();
		int counter=1;
		for(int i=0; i < arrayLsit.size(); i++){
			if(i == arrayLsit.size()-1){
				if((int)arrayLsit.get(i-1) == (int)arrayLsit.get(i)){
					tempArrayList = new ArrayList<>();
					tempArrayList.add(counter);
					tempArrayList.add(arrayLsit.get(i));
					System.out.println("adding value max length if : i : " + i + "tempArrayList : " + tempArrayList.toString()  );
					linkedHashMap.put(i, tempArrayList);
				} else {
					counter=1;
					tempArrayList = new ArrayList<>();
					tempArrayList.add(counter);
					tempArrayList.add(arrayLsit.get(i));
					linkedHashMap.put(i, tempArrayList);
				}
				
				break;
			}
			
			if((int)arrayLsit.get(i) == (int) arrayLsit.get(i+1)){
				counter++;
			} else {
				tempArrayList.add(counter);
				tempArrayList.add(arrayLsit.get(i));
				linkedHashMap.put(i, tempArrayList);
				counter=1;
				tempArrayList = new ArrayList<>();
			}
			
		}
		
		System.out.println("output: " + linkedHashMap);
		ArrayList<Integer> nextArrayList = new ArrayList<>();
		for(Map.Entry<Integer, ArrayList<Integer>> map : linkedHashMap.entrySet()){
			nextArrayList.add(map.getValue().get(0));
			nextArrayList.add(map.getValue().get(1));
		}
		
		System.out.println("input : " + arrayLsit.toString());
		System.out.println("output : " + nextArrayList.toString());
		return nextArrayList;
		
	}
	
}
