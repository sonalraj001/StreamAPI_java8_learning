import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class Test {
    public static void main(String[] args) {
        // Consumer<Integer> consumer = new Consumer<Integer>(){
        //     @Override
        //     public void accept(Integer integer){
        //         System.out.println(integer);
        //     }
        // };

        //this is old way of writing code
        // So consumer is interface we can convert it function ino lambda fucntion

        //consumer = (Integer integer)->{System.out.println(integer)};
        //consumer =(int)->Sout(int);  we can change above line to this

     
        Stream.of(1,3,4,4,5,5).forEach((x)->System.out.println(x));



        //we can do it by using lambda function also
        //integerStream = Stream.of()  so 
        // remove integerStream to Stream.of

        //new code  Stream.of().forEach(consumer)



    }
}
