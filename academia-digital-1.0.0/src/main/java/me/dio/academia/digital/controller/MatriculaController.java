package me.dio.academia.digital.controller;

import java.text.Normalizer.Form;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;
    
    @PostMapping
    private Matricula create(@Valid @RequestBody MatriculaForm) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }
}
