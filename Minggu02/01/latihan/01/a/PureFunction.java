class ObjectWithPureFunction{

    public int sum(int a, int b) {
        return a + b;
    }
}
/**
 * PureFunction
 */
public class PureFunction {

    public static void main(String[] args) {
        ObjectWithPureFunction a = new ObjectWithPureFunction();
        System.out.println(a.sum(2, 3));
    }
}