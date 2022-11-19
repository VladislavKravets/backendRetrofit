package com.example.backend1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class SelectiveCourses {
    private final AtomicLong counter = new AtomicLong();
    List<com.example.backend1.entities.SelectiveCourses> selectiveCoursesMap = Stream.of(
            new com.example.backend1.entities.SelectiveCourses(counter.incrementAndGet(),
                    "Історія розвитку реклами",
                    "Інформація про спеціальність",
                    "ФЕУ",
                    "Пепчук Сергій Михайлович",
                    1),
            new com.example.backend1.entities.SelectiveCourses(counter.incrementAndGet(),
                    "Облікова політика підприємства",
                    "Інформація про спеціальність",
                    "ФЕУ",
                    "Демиденко Світлана Леонтіївна",
                    2),
            new com.example.backend1.entities.SelectiveCourses(counter.incrementAndGet(),
                    "Обробка інформації та мультимедійні системи",
                    "Інформація про спеціальність",
                    "ФІТІС",
                    "Шувалова Людмила Аркадіївна",
                    3)
            ).collect(Collectors.toList());

    @GetMapping("/getSelectiveCourses")
    public List<com.example.backend1.entities.SelectiveCourses> getSelectiveCourses() {
        return selectiveCoursesMap;
    }
}