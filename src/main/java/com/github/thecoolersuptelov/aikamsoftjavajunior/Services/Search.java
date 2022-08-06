package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import org.springframework.stereotype.Service;

@Service
public class Search implements CliActions{
    public void doSmth(){
        System.out.println("jajaja");
    }

    @Override
    public void prepareAnswer() {
        System.out.println("ppupupu");
    }
}
