package com.github.thecoolersuptelov.aikamsoftjavajunior;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Services.CliActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class AikamsoftJavaJuniorApplication implements CommandLineRunner {

    @Autowired
    private Map<String, CliActions> actionsMap;


    public static void main(String[] args) {
        SpringApplication.run(AikamsoftJavaJuniorApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException("Для запуска выполнения программы требуется 3 аргумента." + "Передано: " + args.length + ". Проверьте корректность аргументов.");
        }

        if (!actionsMap.containsKey(args[0])) {
            throw new IllegalArgumentException("Запрашиваемый алгоритм работы не найден." + actionsMap.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.joining(",")));
        }

        if (!Files.exists(Path.of(args[1])) || !Files.exists(Path.of(args[2]))) {
            var notExistedFile = Files.exists(Path.of(args[1])) ? args[2] : args[1];
            throw new IllegalArgumentException("По предоставленному пути файл не обнаружен" + notExistedFile);
        }
        actionsMap.get(args[0]).doStuff(args[1], args[2]);
    }
}
