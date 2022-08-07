// helloWorld is a public class
public class helloWorld{
    // main 
    public static void main(String[] args) {
        System.out.println("Hello, World, 中文测试");
        System.out.println("TAB, \\t: \nHello\tWorld");
        // if \r, rewrite from the front of the line
        System.out.println("return line, \\r: \nHello\rWar");
    }
}

// compile with 
// javac helloWorld.java
// a Java bytecode file helloWorld.class is generated
// run on JVM with
// java helloWorld.class

// only one Public class in the source code
// no limit on other code
// if multiple class in the source code:
// after compile, multiple *.class file will be generated
// each *.class file is related to the class with the same name in the source code.

// the source code fileName must consistent with the public class name.