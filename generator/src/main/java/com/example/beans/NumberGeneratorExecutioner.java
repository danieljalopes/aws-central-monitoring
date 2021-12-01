package com.example.beans;

import com.example.generator.IntegerGenerator;

import javax.inject.Singleton;
import java.util.LinkedList;
import java.util.List;

@Singleton
public class NumberGeneratorExecutioner {

    private List<Thread> integerGenerators = new LinkedList<>();


    /**
     * Start a new thread of integer generators
     * This thread will stop when
     * @return
     */
    public String startNewIntegerGenerator() {
        String name = "Thread nr: " + integerGenerators.size();

        Runnable runnable = new IntegerGenerator();
        integerGenerators.add(new Thread(runnable, name));

        return name;
    }
}
