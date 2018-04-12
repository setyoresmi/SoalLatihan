package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	static String testID="A1234";
	
	public static void main(String[] args) {
		
		ArrayList<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle(Math.random()));
		circleList.add(new Circle(Math.random()));
		circleList.add(new Circle(Math.random()));
		
		for (Circle circle : circleList) {
			System.out.println("Area : "+circle.getArea());
		}
		
		Map<String,String> employeeMap = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
		employeeMap.put("a1234", "Steve Jobs");
		employeeMap.put("a1235", "Scott McNealy");
		employeeMap.put("a1236", "Jeff Bezos");
		employeeMap.put("a1237","Larry Ellison");
		employeeMap.put("a1238", "Bill Gates");
	
		
		if(employeeMap.containsKey(testID)) {
			System.out.println("VALID ID");
		}
		else {
			System.out.println("INVALID ID");
		}
		
		Map<Integer,String> maps = new HashMap<>();
		maps.put(1, "satu");
		maps.put(2, "dua");
		maps.put(30000, "sepuluh ribu");
		
		for (Integer value : maps.keySet()) {
			System.out.println("Key : "+value+",value : "+maps.get(value));
		}	
		
		ArrayList<String> arrays = new ArrayList<String>();
		long startTimeArray = System.nanoTime();
		arrays.add("A");
		arrays.add("B");
		arrays.add("C");
		arrays.add("D");
		arrays.add("E");
		arrays.add("F");
		arrays.add("G");
		arrays.add("H");
		arrays.add("I");
		arrays.add("J");
		arrays.add("K");
		arrays.add("L");
		arrays.get(6);
		long endTimeArray = System.nanoTime();
		long deltaArrayTime = endTimeArray - startTimeArray;
		System.out.println("delta array time : "+deltaArrayTime);
		
		LinkedList<String> lists = new LinkedList<String>();
		long startTimeLinkedlist = System.nanoTime();
		lists.add("1");
		lists.add("2");
		lists.add("3");
		lists.add("4");
		lists.add("5");
		lists.add("6");
		lists.add("7");
		lists.add("8");
		lists.add("9");
		lists.add("10");
		lists.add("11");
		lists.add("12");
		lists.get(6);
		long endTimeLinkedlist = System.nanoTime();
		long deltaLinkedlistTime = endTimeLinkedlist - startTimeLinkedlist;
		System.out.println("delta linked list time : "+deltaLinkedlistTime);
		
	}
}
