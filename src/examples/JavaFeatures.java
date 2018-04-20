package examples;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


public class JavaFeatures {

	// package friendship

	public static void main(String[] args) {
		//Unified JVM logging
		long pid = ProcessHandle.current().pid();
		System.out.println("Pid=" + pid);
		overLoadedOf();

		
	}
	
	private void notes() {
		// complie using --release to make backward compatible rather than -source and -target
		// java --list -modules // to find all JDK9 modules
	
		/*
		 * jshell – for testing
		 * Read evaluate Print loop (REPL) interactive tool for  testing java statements  etc – no need to package
		 * https://bugs.openjdk.java.net/browse/JDK-8043364 
		 */
	
		/*
		 * jLink
		 * Tool that can assemble and optimize a set of modules and their dependencies into a custom run-time image
		 * http://openjdk.java.net/jeps/282
		 */
	

	}

	
	private static void overLoadedOf() {
		List<String> linkedWords = new LinkedList<String>();
		List<Integer> unorderedInts = List.of(3, 4, 5, 1, 2, 0);
		//Prints the first in list
		System.out.println("Overlaoded of, print first value:"+unorderedInts.listIterator().next());	
	}
	
	
	
}


