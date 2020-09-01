package com.mx.spring.cloud.feing.controller;

import com.mx.spring.cloud.feing.client.OMDbClient;
import com.mx.spring.cloud.feing.response.OMDbResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OMDbController {

    @Autowired
    OMDbClient omDbClient;

    @GetMapping(value = "/omdb")
    public ResponseEntity<OMDbResponse> omdb(@RequestParam String i) {

        return new ResponseEntity<OMDbResponse>(omDbClient.get(i), HttpStatus.OK);
    }

}
