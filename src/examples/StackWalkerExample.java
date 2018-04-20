package examples;

import java.lang.StackWalker.Option;
import java.lang.StackWalker.StackFrame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

/*
 * designed to be efficient by allowing lazy access to the stack frames
 */
public class StackWalkerExample {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Method fooMethod = FooHelper.class.getDeclaredMethod("foo", (Class<?>[]) null);
		fooMethod.invoke(null, (Object[]) null);
	}
}

class FooHelper {
	protected static void foo() {
		BarHelper.bar();
		
		// to print the class name
		BarHelper2.bar();
	}
}

class BarHelper {
	protected static void bar() {
		// allow traversing a stream of stack frames for the current thread, starting from the top frame, and applying the given Function on the stream.
		// the -> separates the parameters (left-side) from the actual expression (right side).
		List<StackFrame> stack = StackWalker.getInstance().walk((s) -> s.collect(Collectors.toList()));
		for (StackFrame frame : stack) {
			System.out.println(frame.getClassName() + " " + frame.getLineNumber() + " " + frame.getMethodName());
		}
	}
}

class BarHelper2 {
    protected static void bar() {
    	// returns the class that invoked the method that calls this method.
        System.out.println(StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE).getCallerClass());
    }
}