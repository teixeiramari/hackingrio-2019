package com.flavia_controller;

import com.flavia_model.Jogo;
import com.flavia_services.FlaviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

public class FlaviaController {
    /*

    //filtra os eventos por data
     @GetMapping(value="consultadata/{dataJogo}")
     public ResponseEntity<Jogo> findById(@PathVariable String dataJogo){
     return flaviaService.findById(dataJogo)
     .map(record -> ResponseEntity.ok().body(record))
     .orElse(ResponseEntity.notFound().build());
     }


    @Autowired
    private FlaviaService flaviaService;

     //filtra os eventos por modalidade
     @GetMapping(value="consultamodalidade/{modalidadeJogo}")
     public ResponseEntity<Jogo> findById(@PathVariable String modalidadeJogo){
     return flaviaService.findById(modalidadeJogo)
     .map(record -> ResponseEntity.ok().body(record))
     .orElse(ResponseEntity.notFound().build());
     }
     */


}
