package com.gestion.tareas.GestordeTareas.repository;

import com.gestion.tareas.GestordeTareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
