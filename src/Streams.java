import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> oneToTen = IntStream
                .rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> squares = oneToTen
                .stream()
                .map(x->x*x)
                .collect(Collectors.toList());
        for (Integer x :
                squares) {
            System.out.println(x);
        }
        List<Integer> evens = oneToTen
                .stream()
                .filter(x->(x % 2)==0)
                .collect(Collectors.toList());

        IntStream limitTo5 = IntStream
                .range(1,10)
                .limit(5);
        limitTo5.forEach(System.out::println);


    }


}


