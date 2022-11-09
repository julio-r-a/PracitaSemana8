package com.example.pracitasemana8.Controller;

import com.example.pracitasemana8.Model.Estudiante;
import com.example.pracitasemana8.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiante/v1")
public class EstudianteController {

    @Autowired
    private IEstudianteService service;

    @RequestMapping(path = "/listar", method = RequestMethod.GET)
    public ResponseEntity<List<Estudiante>> listar(){
        return new ResponseEntity<List<Estudiante>>(service.list(), HttpStatus.OK) ;
    }

    @RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Integer id){

        Estudiante estudiante = service.obtener(id);

        if( estudiante != null) {
            return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
        }else {
            return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
        }

    }
}
