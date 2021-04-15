package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Map_Filter_Streams {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);
		arrList.add(30);
		
		
		
		  Stream s = arrList.stream().filter(i -> i%2 ==0);
		
		 s.forEach(i->System.out.println(i));
		 
		
		
		//to find squares,
		
		 Stream a=arrList.stream().map(x->x*x);
		 a.forEach(x->System.out.println(x));
		 
		
	}

}