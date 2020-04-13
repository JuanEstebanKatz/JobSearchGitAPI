package com.jkatz.jobsearch;

import com.beust.jcommander.JCommander;
import com.jkatz.jobsearch.cli.CLIArguments;

import static com.jkatz.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {

    public static void main(String[] args) {

       // System.out.println("Hola busqueda de chamba");
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newIsntance);

    }
}
