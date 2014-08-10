package asg10.exercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ChoMayChet {
	Collection list = new ArrayList<String> ();
	
	
	public void add(String name) {
		list.add(name);
	}
	
	public void play() {
		int i = 1;
		int j = 1;
		//Collection mylist = list;
		Iterator iterator ;
		System.out.println(j+": " + list.toString());
		while(list.size() > 1) {
			iterator = list.iterator();
			while(iterator.hasNext()) {
				//System.out.print(i);
				iterator.next();
				if( i % 3 == 0) {
					iterator.remove();
					i = 0;
				}
				i++;
			}
			System.out.println(j+": " + list.toString());
			j++;
		}
	}
	public static void main(String [] args) {
		ChoMayChet game = new ChoMayChet();
		game.add("a");
		game.add("b");
		game.add("c");
		game.add("d");
		game.add("e");
		game.add("f");
		game.add("g");
		game.play();
		System.out.print("Input number gamer: ");
		game = new ChoMayChet();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i< n; i++) {
			System.out.print("Gamer no."+ (i+1) +": "); 
			game.add(input.next());
			System.out.println();
		}
		game.play();
	}
}
