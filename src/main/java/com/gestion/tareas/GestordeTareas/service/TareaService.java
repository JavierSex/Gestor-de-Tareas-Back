package com.gestion.tareas.GestordeTareas.service;

import com.gestion.tareas.GestordeTareas.entity.Tarea;
import com.gestion.tareas.GestordeTareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService implements BaseService<Tarea>{

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public Tarea agregar(Tarea datosEntidad) throws Exception {

        try {

            Tarea tareaAgregada=tareaRepository.save(datosEntidad);
            return tareaAgregada;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    @Override//dto y mapper
    public List<Tarea> buscarTodos() throws Exception {
        try {

            List<Tarea>tareas=tareaRepository.findAll();
            return tareas;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
