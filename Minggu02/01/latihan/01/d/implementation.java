/**
 * implementation
 */
public class implementation implements MyInterface2 {

    public void run()
    {
        System.out.println("test");
    }
    public static void main(String[] args) {
        MyInterface2.doItStatically();
        implementation impl = new implementation();
        impl.doIt();
    }
}