package list;

import java.util.*;

public class desc {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		list.add("3");
		list.add("1");
		list.add("5");
		list.add("2");
		list.add("4");
		Collections.sort(list, Collections.reverseOrder());
		
        System.out.println("List in descending order:"+ list);
	}
}
		
		
		


