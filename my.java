class MyEx extends RuntimeException {
}
public class Test {
public static void main(String... args) {
try {
throw new MyEx();
} 
catch (MyEx e) 
{
System.out.println("Exception caught");
}
}
}
