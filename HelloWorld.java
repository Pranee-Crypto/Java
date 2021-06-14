public class HelloWorld{
public static void main(String ...args){// using variable arguments
String firstName= args[0];  //these are the command line arguments
String lastName = args[1];
System.err.println("Welcome to Java"+firstName+" "+lastName);
}
}