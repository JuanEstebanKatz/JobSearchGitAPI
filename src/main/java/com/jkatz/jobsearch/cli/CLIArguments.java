package com.jkatz.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    // Constructor de clase evita que creen mas objetos
    CLIArguments(){}

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith =  CLIKeyWordValidator.class,
            description = "KEYWORD"
    )
    private String keyWord;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busqueda puede incluir una ubicacion"
    )
    private String location;

    @Parameter(
            names ={"--page","-p"},
            description = "numero de pagina la api devuelve 50 results"
    )
    private int page = 0;

    @Parameter(
          names = {"--full-time"},
          description = "Agregar si queremos trabajo de tiempo completo"
    )
    private boolean isFulltime = false;

    @Parameter(
           names = {"--markdown"},
            description = "obtener los resultados en markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
           names = {"--help"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar esta ayuda"
    )
    private boolean isHelp;

    // solo Get ya que relativamente es inmutable.

    public String getKeyWord() {
        return keyWord;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    // para ver en el debug.
    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyWord='" + keyWord + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFulltime=" + isFulltime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newIsntance(){
        return new CLIArguments();
    }
}
