package examples;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


public class JavaFeatures {

	// package friendship

	public static void main(String[] args) {
		long pid = ProcessHandle.current().pid();
		System.out.println("Pid=" + pid);
		overLoadedOf();

		
	}
	
	private void notes() {
		// complie using --release to make backward compatible rather than -source and -target
		// java --list -modules // to find all JDK9 modules
	}

	
	private static void overLoadedOf() {
		List<String> linkedWords = new LinkedList<String>();
		List<Integer> unorderedInts = List.of(3, 4, 5, 1, 2, 0);
		//Prints the first in list
		System.out.println("Overlaoded of, print first value:"+unorderedInts.listIterator().next());	
	}
	
	
	
}


