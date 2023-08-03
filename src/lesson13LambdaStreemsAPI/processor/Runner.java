package lesson13LambdaStreemsAPI.processor;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Processor> processors = new ArrayList<>();
        List<Integer> clockSpeeds = new ArrayList<>();
        List<String> models = new ArrayList<>();
        processors.add(new Processor("AMD EPYC 9654", 2400));
        processors.add(new Processor("AMD EPYC 9554", 3100));
        processors.add(new Processor("AMD EPYC 9474F", 3600));
        processors.add(new Processor("AMD Ryzen Threadripper PRO 5995WX", 2700));
        processors.add(new Processor("AMD EPYC 9454P", 2750));
        processors.add(new Processor("AMD EPYC 9654P", 2400));
        processors.add(new Processor("Intel Xeon w9-3495X", 1900));
        processors.add(new Processor("AMD EPYC 7773X", 2200));
        processors.add(new Processor("AMD EPYC 9534", 2450));
        processors.add(new Processor("AMD EPYC 7763", 2450));

        System.out.println("Сортировка с использованием компоратора:");

        processors.sort(Comparator.comparing(Processor::getClockSpeed)
                .thenComparing(Comparator.comparing(Processor::getModel)));

        System.out.println(processors);
        for (Processor proc : processors ) {
            System.out.println(proc.getModel()+"\t"+proc.getClockSpeed());
            clockSpeeds.add(proc.getClockSpeed());
            models.add(proc.getModel());
        };

        clockSpeeds.forEach(System.out::println);

        System.out.println("Stream:");
        List<Integer> nn = clockSpeeds.stream()
                .map(value -> value + value)
                .filter(it -> it % 2 == 0)
                .distinct()
                .limit(5)
                .sorted()
                .toList();

        nn.forEach(System.out::println);

        // сохранение в коллекцию
        System.out.println("Множество:");
        Set<String> set = models.stream()
                .skip(models.size()-5)
                .map(String::toLowerCase)
                .peek((it)->System.out.print(it+"\t"))
                .filter(it -> it.length()<20)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        set.forEach(System.out::println);

        set.stream()
                .findFirst()
                .orElse("1");

    }
}
