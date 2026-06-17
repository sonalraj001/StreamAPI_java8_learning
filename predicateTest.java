import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class predicateTest {
    public static void main(String[] args) {
        //predicate
        Predicate<Integer> isEven = x-> x % 2 == 0;

        System.out.println(isEven.test(4));

        //function
        Function<Integer,Integer> f1 = x->2*x;
        Function<Integer,Integer> f2= x->x*x*x;

        //andThen
        System.out.println(f1.andThen(f2).apply(3));
        System.out.println(f2.andThen(f1).apply(5));

        //compose
        System.out.println(f1.compose(f2).apply(3));

        //Consumer
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("vipul");

        Consumer<List<Integer>> listConsumer = li->{
            for(Integer i : li){
                System.out.println(i+100);
            }
        };

        Consumer<List<Integer>> listConsumer1 = li->{
            for(Integer i :li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> listConsumer2 = listConsumer.andThen(listConsumer1);

        listConsumer2.accept(Arrays.asList(1,2,3,4,5));


        //suppliers

    }
}
