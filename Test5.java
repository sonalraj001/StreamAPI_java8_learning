import java.sql.SQLOutput;
import java.util.function.*;

public class Test5 {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = x-> x%2 == 0;

        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x%2 ==0 && y%2 ==0;
        System.out.println("bipredict result "+biPredicate.test(2,6));


        Function<String ,Integer> function = x-> x.length();
        System.out.println(function.apply("sonal"));

        BiFunction<String ,String,Integer> biFunction = (x,y)-> x.length()+y.length();
        System.out.println("bifunction result " + biFunction.apply("Sonal","Raj"));

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        BiConsumer<Integer,Integer> biConsumer = (x,y)-> System.out.println("biconsumer result "+x+" "+y);
        biConsumer.accept(4,6);
    }
}
