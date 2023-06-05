package com.gestion.tareas.GestordeTareas.controller;

import com.gestion.tareas.GestordeTareas.entity.Tarea;
import com.gestion.tareas.GestordeTareas.repository.TareaRepository;
import com.gestion.tareas.GestordeTareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarea")
@CrossOrigin(origins = "http://localhost:4200")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @PostMapping("/agregar")
    private ResponseEntity<Tarea> agregar (@RequestBody Tarea datosTarea){
        try {

            Tarea tareaAgregada = tareaService.agregar(datosTarea);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(tareaAgregada);

        }catch (Exception error){
            String mensaje="Tenemos problemas "+ error.getMessage();
            Tarea tarea = new Tarea();
            tarea.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(tarea);
        }
    }
    @GetMapping("/tareas")
    public List<Tarea> listarTareas(){
        try {
            return tareaService.buscarTodos();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
