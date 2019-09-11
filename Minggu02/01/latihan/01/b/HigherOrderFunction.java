public class HigherOrderFunctionClass {

    public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
           T instance = producer.produce();
           configurator.configure(instance);
           return instance;
        }
    }
}
/**
 * HigherOrderFunction
 */
public interface IFactory<T> {
    T create();
 }
 public interface IProducer<T> {
    T produce();
 }
 public interface IConfigurator<T> {
    void configure(T t);
 }
public class HigherOrderFunction {

    public static void main(String[] args) {
        
    }
}