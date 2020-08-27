package com.mx.spring.cloud.feing.client;

import com.mx.spring.cloud.feing.config.OMDbClientConfig;
import com.mx.spring.cloud.feing.response.OMDbResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(configuration = OMDbClientConfig.class,
        name = "omdb-client",
        url = "${omdb.url}")
public interface OMDbClient {

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    OMDbResponse get(@RequestParam("i") String i);
}
