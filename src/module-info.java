/**
 * 
 */
/**
 * @author s258115
 *
 */

// open module Java9( // opens whole module to others
module Java9{
	// Modules stops helper code being able to traverse the classpath back to the application code
	
	exports examples; // for any one to use
	//exports modules to myapp; // qualify the export to only myapp
	requires java.base; // don't need this line as ALWAYS need
	requires jdk.compiler;
	requires java.desktop; // needed for Examples.JavaFeatures class
	exports flowExample;
	exports predicateExample;
	// automatic modules inferred from derived JAR file - so all existing jar files can be modules
	
	// open myapp to xx // for reflection. Note can open the module ply placing at declaration 

}