package com.jkatz.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {

    // con esta clase hacemos el llamado, es una funcion pura
    //ya que si sellama tres veces con la misma URL nos devolvera el mismo result
    static <T> T buildAPI(Class<T> clazz, String url){
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(clazz,url);
    }
}
