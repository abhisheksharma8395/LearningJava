package streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x -> x+1).limit(20000).toList();
        List<Long> factorialslist = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream : "+(endTime - startTime)+" ms");


        // Parallel Streams are most effective for cpu-intensive or large datasets where tasks are independent
        // They may overhead for simple tasks or small datasets

        startTime = System.currentTimeMillis();
        factorialslist = list.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream : "+(endTime - startTime)+" ms");

        // Cumulative Sum                                 // Remember always use parallelStream for stateless operartion
        // [1,2,3,4,5] --> [1,3,6,10,15]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger();
        List<Integer> cumulativeSum = numbers.stream().map(x -> {
            int i = x + sum.get();
            sum.set(i);
            return i;
        }).collect(Collectors.toList());
        System.out.println(numbers+" -> "+cumulativeSum);
    }
    private static long factorial(int n){
        long result = 1;
        for(int i = n ; i>1;i--){
            result *= i;
        }
        return result;
    }
}
