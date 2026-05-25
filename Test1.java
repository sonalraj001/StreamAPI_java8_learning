import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Integer [] nums ={1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(nums)
                .filter(x-> x>5 ) //it will filter based on some condition
                .map(x->x*2); // some operation after filtering


                //for each is terminal operation so if you dont apply this then no intermideate
                //will be evaluated
                //terminal operation is opearation which triggers the execution of pipeline
        //after terminal the pipeline get close
                //.forEach(x-> System.out.println(x)); // do some operation on each one
    }
}
