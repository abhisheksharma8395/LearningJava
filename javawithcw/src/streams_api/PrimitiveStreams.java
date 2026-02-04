package streams_api;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::println);

        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));

        IntStream.of(1,2,3);

        IntStream stream1 = new Random().ints(5);
        System.out.println(stream1.boxed().toList());

        DoubleStream stream2 = new Random().doubles(5);
//        System.out.println(stream2.sum());
        System.out.println(stream2.boxed().toList());
    }
}
