package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxUsingStreams {

	public static void main(String[] args) {

			List<Integer> arrList = new ArrayList<Integer>();
			arrList.add(15);
			arrList.add(20);
			arrList.add(25);
			arrList.add(90);
			arrList.add(15);
			arrList.add(35);
			
			Stream<Integer> s= arrList.stream().sorted((i1,i2)->i2.compareTo(i1));
			List<Integer> ar= s.collect(Collectors.toList());

			//Stream s= arrList.stream().sorted((i1,i2)->i2.compareTo(i1));
			//Object ar= s.collect(Collectors.toList());
			
			System.out.println(ar.get(0));
			
			System.out.println("Single Line");

			int i=arrList.stream().max((i1,i2)->i2.compareTo(i1)).get();

			int j=arrList.stream().min((i1,i2)->i2.compareTo(i1)).get();
			System.out.println(i);
			System.out.println(j);
			
			

	}

}
  