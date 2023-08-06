package lesson13LambdaStreemsAPI;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntStreamRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 56, 23, 89);

        IntStream intStream = IntStream.of(3, 5, 4, 7);
        //intStream.mapToObj(); получить стрим объектов, а не примитивов

        IntSummaryStatistics statistics = numbers.stream()
                .mapToInt(Integer::intValue)
                //.mapToObj(Integer::valueOf) приведение обратно к объекту
                .summaryStatistics();


        System.out.println(statistics);


        IntStream.range(0, 10).forEach(System.out::println);

        IntStream.iterate(4, new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int operand) {

                        return operand + 5;
                    }
                })
                .skip(15)
                .limit(20)
                .forEach(System.out::println);

        ;

        IntStream.iterate(10,x -> x < 200, x -> x+7)
                .skip(15)
                .limit(20)
                .forEach(System.out::println);


    }
}
