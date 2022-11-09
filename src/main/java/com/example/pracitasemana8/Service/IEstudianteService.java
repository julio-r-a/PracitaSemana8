package com.example.pracitasemana8.Service;

import com.example.pracitasemana8.Model.Estudiante;
import java.util.List;

public interface IEstudianteService {
    List<Estudiante> list();
    Estudiante obtener(Integer id);
}
