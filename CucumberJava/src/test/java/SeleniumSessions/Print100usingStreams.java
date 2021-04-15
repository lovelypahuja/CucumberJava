package SeleniumSessions;

import java.util.stream.IntStream;

public class Print100usingStreams {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).forEach(System.out::println);

	}

}
