package com.jkatz.jobsearch;

import com.beust.jcommander.JCommander;

import java.util.function.Supplier;

public class CommanderFunctions {

    static <T> JCommander buildCommanderWithName(String cliName, Supplier <T> argumentSuplier){

    JCommander jCommander = JCommander.newBuilder()
            .addCommand(argumentSuplier.get())
            .build();

    jCommander.setProgramName(cliName);

    return jCommander;
    }

}
