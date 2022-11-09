package com.example.pracitasemana8.Repository;

import com.example.pracitasemana8.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
