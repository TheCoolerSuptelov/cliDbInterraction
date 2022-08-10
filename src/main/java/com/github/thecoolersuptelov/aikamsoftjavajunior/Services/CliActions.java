package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.core.serializer.support.SerializationFailedException;

import java.io.File;
import java.io.IOException;

public interface CliActions <InputT,OutputT>{
    public default void doStuff(String inputPath, String outputPath) throws IOException {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }
    public OutputT prepareAnswer(InputT inputDeserializeData);
    public InputT deserializeInputValue(String inputPath) throws IOException;
    public default void serilizeOutputData(String outputPath, OutputT dataToSerialize){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File(outputPath), dataToSerialize);
        } catch (IOException e) {
            throw new SerializationFailedException(e.getMessage());
        }
    }

}
