package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortInStreams {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);
		arrList.add(30);
		arrList.add(15);
		arrList.add(35);
		//arrList.stream().distinct().forEach(x->System.out.println(x));
		//List<Integer> newarrlist=
				List<Integer> NewarrList = arrList.stream().sorted().distinct().collect(Collectors.toList());
				NewarrList.forEach(x->System.out.println(x));
				
				long s=arrList.stream().count();
				System.out.println(s);
				
	}

}
