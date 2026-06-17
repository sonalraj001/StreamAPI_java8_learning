import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,5,56,7,7)
                .filter(x->x<8) //we can change this with take while method
                .map(x->x*x)
                .forEach(x-> System.out.println(x));

        //takeWhile -> it is shirt circuit intermediate method

        Stream.of(100,22,301,404,201,222,199,453,321,890,1000,111,1901)
                .takeWhile(x->x<999)
                .map(x-> x)
                .forEach(x-> System.out.println(x));

        //take while will stop the filter once value get invalid when x is < 999
        //doing short circuit when condition fails
    }
}
