package com.gestion.tareas.GestordeTareas.service;

import java.util.List;

public interface BaseService<E> {

    public E agregar(E datosEntidad) throws Exception;

    public List<E> buscarTodos() throws Exception;

}
