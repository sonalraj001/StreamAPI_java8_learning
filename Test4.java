import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Stream.of("sonal","raj","jai","rakesh","kiran","smiran")
                .skip(3)
                .forEach(str-> System.out.println(str));
    }
}
