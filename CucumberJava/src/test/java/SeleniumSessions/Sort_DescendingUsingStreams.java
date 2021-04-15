package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sort_DescendingUsingStreams {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);
		arrList.add(30);
		arrList.add(15);
		arrList.add(35);
		
		arrList.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x->System.out.println(x));
		String str;
	

	}

}
