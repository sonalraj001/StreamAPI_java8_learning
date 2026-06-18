import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        //why stream

        //imperative approach
        int[] array ={1,2,3,4,5};
        int sum = 0;
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
        System.out.println(sum);

        //declarative approach
        //stream
        //ways to create  stream
        List<String> mylist = Arrays.asList("a","b","c","d","e","f","g");
        Stream<String> liststream = mylist.stream();

        String [] arrays = {"a","b","c","d","e","f"};
        Stream<String> arraysStream = Arrays.stream(arrays);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,4,5,5,5);

        Stream<Integer> limitStream = Stream.iterate(0,n->n+1).limit(20);

        Stream.generate(()->"hello").limit(3);

        System.out.println("List Stream:");
        liststream.forEach(System.out::print);

        System.out.println("\nArray Stream:");
        arraysStream.forEach(System.out::print);

        System.out.println("\nInteger Stream:");
        integerStream.forEach(System.out::print);

        System.out.println("\nLimit Stream:");
        limitStream.forEach(System.out::print);
    }
}
