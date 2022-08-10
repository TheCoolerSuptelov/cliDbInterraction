package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import java.io.IOException;

public interface CliActions <InputT,OutputT>{
    public default void doStuff(String inputPath, String outputPath) throws IOException {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }
    public OutputT prepareAnswer(InputT inputDeserializeData);
    public InputT deserializeInputValue(String inputPath) throws IOException;
    public void serilizeOutputData(String outputPath, OutputT dataToSerialize);

}
