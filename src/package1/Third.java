package package1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Third {
	
	public static void problem3(){
	/*	
		input : 6
		output :
		1
		1 1
		2 1
		1 2 1 1
		1 1 1 2 2 1
		3 1 2 2 1 1
		*/
		
		LinkedHashMap<Integer, ArrayList<Integer>> linkedHashMap = new LinkedHashMap<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> nextRowArrayList = new ArrayList<>();
		ArrayList<Integer> currentRowArrayList = new ArrayList<>();
		
		for(int i = 1; i<=6; i++){
			if(i==1){
				list.add(1);
				currentRowArrayList = list;
				linkedHashMap.put(i, list);
				list = new ArrayList<>();
			} else if(i==2){
				list.add(1);
				list.add(1);
				currentRowArrayList = list;
				linkedHashMap.put(i, list);
				list = new ArrayList<>();
			} else {
				System.out.println("curr : " + currentRowArrayList.toString());
				nextRowArrayList = Second.problem2(currentRowArrayList);
				System.out.println("next : " + nextRowArrayList.toString());
				linkedHashMap.put(i, nextRowArrayList);
				currentRowArrayList = nextRowArrayList;
				nextRowArrayList = new ArrayList<>();
				
			}
		

		
		}

		System.out.println(linkedHashMap.toString());
	}

}
