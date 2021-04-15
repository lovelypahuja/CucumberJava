package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Streams {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(5);
		arrList.add(30);
		
		List<Integer> newA1 = new ArrayList<Integer>();
		newA1 = arrList.stream().filter(x-> x>=15).collect(Collectors.toList());
		newA1.stream().forEach(x->System.out.println(x));
		
		 
		
	}

}
