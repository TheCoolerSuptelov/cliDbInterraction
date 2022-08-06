package com.github.thecoolersuptelov.aikamsoftjavajunior;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input.SearchInput;
import com.github.thecoolersuptelov.aikamsoftjavajunior.Services.CliActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(AikamsoftJavaJuniorApplication.class);
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

        if (actionsMap.containsKey(args[0]) == false) {
            throw new IllegalArgumentException("Запрашиваемый алгоритм работы не найден." + actionsMap.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.joining(",")));
        }

        if (!Files.exists(Path.of(args[1])) || !Files.exists(Path.of(args[2]))) {
            var notExistedFile = Files.exists(Path.of(args[1])) ? args[2] : args[1];
            throw new IllegalArgumentException("По предоставленному пути файл не обнаружен" + notExistedFile);
        }
        var xxx = new ObjectMapper().readValue(Files.readString(Path.of(args[1])), SearchInput.class);


        actionsMap.get(args[0]).doStuff(args[1], args[2]);
    }
}
