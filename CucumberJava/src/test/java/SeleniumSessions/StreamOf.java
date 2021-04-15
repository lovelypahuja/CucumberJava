package SeleniumSessions;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,1111).forEach(x->System.out.println(x));
		String[] name ={"john","lovely","jairus", "nancy"};
				Stream.of(name).filter(x -> x.length() >= 5).forEach(x->System.out.println(x));
	}

}
