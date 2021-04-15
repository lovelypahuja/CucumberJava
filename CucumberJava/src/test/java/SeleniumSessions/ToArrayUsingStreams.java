package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayUsingStreams {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(25);
		arrList.add(30);
		arrList.add(40);
		
		Stream<Integer> str=arrList.stream().filter(i->i>=20);
		Object[] ar=str.toArray();
		for (Object o : ar) {
			System.out.println(o);
		}

			System.out.println("one liner");
			
			Object[] arOneLiner = arrList.stream().filter(i->i>=20).sorted((i1,i2)->i2.compareTo(i1)).toArray();
			for(Object b: arOneLiner)
			{
			System.out.println(b);
		}
	
	}
}

