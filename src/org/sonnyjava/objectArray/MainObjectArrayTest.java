package org.sonnyjava.objectArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MainObjectArrayTest {

	public static void main(String[] args) {
		
		//Firsr Create an object Food items:
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Chicken Sandwitch");
		Food food3 = new Food("Loster Noodle");
		
		//Now Create an Object Array to hold those 3 items above:
		Food[] items = {food1, food2, food3};
		//Print out all 3 items from an Object Array:
		System.out.println("Display 3 items food using for Loop:");
		for(Food item: items) {
			System.out.println(item.foodName);
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		//Method #1:
		//Now add the an Array of Object above into the List:
		List<Food> myList = Arrays.asList(items);
		//Now display those 3 items food by looping through the array:
		System.out.println("Output 3 items food using ListIterator Loop:");
		ListIterator<Food> itemFood = myList.listIterator();
		while(itemFood.hasNext()) {
			System.out.println(itemFood.next().foodName);
		
		}
		
		System.out.println("-------------------------");
		
		//Method #2:
		//Display 3 items using the Collections method addAll:
		System.out.println("Here are 3 items: ");
		List<Food> list2 = new ArrayList<Food>();
		Collections.addAll(list2,items);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i).foodName);
		}
		
		System.out.println("**************************");
		
		//Method #3:
		List<Food> list3 = new  ArrayList<Food>();
		//Add an Array of Object into the List:
		for(Food foodItem: items) {
			list3.add(foodItem);
		}
		
		//Now Print out the List;
		System.out.println("Here are the List: ");
		for(int j=0; j<list3.size(); j++) {
			System.out.println(list3.get(j).foodName);
		}
		
		
	}

}
