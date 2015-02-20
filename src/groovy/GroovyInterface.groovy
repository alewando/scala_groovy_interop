interface GroovyInterface {

	// This is the line that causes scalac to choke.
	// It results in a GroovyInterface$1 class, which is a non-static inner class but it's constructor does not
	// include the implicit parameter that is the immediate enclosing instance.
	// See http://jira.codehaus.org/browse/GROOVY-7312
	//
	// Scalac error:    
	//   [scalac] error: error while loading 1, class file '..../scala_groovy_interop/classes/com/example/groovy/GroovyInterface$1.class' is broken
    //   [scalac] (class java.util.NoSuchElementException/head of empty list)
	final static def closure = { x -> "banana" }

}