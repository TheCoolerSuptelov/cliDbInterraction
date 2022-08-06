package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

public interface CliActions <InputT,OutputT>{
    public default void doStuff(String inputPath, String outputPath){
      serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }
    public OutputT prepareAnswer(InputT inputDeserializeData);
    public InputT deserializeInputValue(String inputPath);
    public void serilizeOutputData(String outputPath, OutputT dataToSerialize);

}
