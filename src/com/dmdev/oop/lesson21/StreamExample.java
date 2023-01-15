package com.dmdev.oop.lesson21;

import com.dmdev.oop.lesson16.ProcessorType;

import javax.xml.xpath.XPathEvaluationResult;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88","1", "22", "33", "44", "55", "66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(3)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
        IntStream.of(1, 2,  3, 4);
        Stream.of ("88","1", "22", "33", "44", "55", "66")
                .peek(System.out::println)
                .collect(Collectors.toList());
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);

        //бесконечный цикл
        IntStream.iterate(0, operand -> operand +3)
                .skip(20)
                .limit(100)
                .forEach(System.out::println);
        }

    }

