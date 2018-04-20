package examples;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

		private volatile int counterV;
		public int getNextUniqueIndexV() {
		    return counterV++; // Not atomic, multiple threads could get the same result
		}

		// could used synchonized block instead - but thread saftey is built into the object itself
		private AtomicInteger counterA;
		public int getNextUniqueIndexA() {
		    return counterA.getAndIncrement();
		}
		
}
