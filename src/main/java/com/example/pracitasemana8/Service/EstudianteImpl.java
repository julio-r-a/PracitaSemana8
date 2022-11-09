package com.example.pracitasemana8.Service;

import com.example.pracitasemana8.Model.Estudiante;
import com.example.pracitasemana8.Repository.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteImpl implements IEstudianteService{

    @Autowired
    private IEstudianteRepository repository;

    @Override
    public List<Estudiante> list() {
        return repository.findAll();
    }

    @Override
    public Estudiante obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
