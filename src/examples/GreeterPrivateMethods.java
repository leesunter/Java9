package examples;


// interfaces with method visbality levels
public interface GreeterPrivateMethods {

	// can have default Java 8
    default void greetSomeone(String personName, boolean female) {
        System.out.println("Hi " + getTitle(female) + " " + personName);
    }
    default void farewellSomeone(String personName, boolean female) {
        System.out.println("Bye " + getTitle(female) + " " + personName);
    }
    
    // can have private methods Java 9 
    private String getTitle(boolean female) {
        return female ? "Ms" : "Mr";
    }

}
