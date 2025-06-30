package com.example.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class Controller {

    private final List<String> tareas = new ArrayList<>();

    @GetMapping
    public List<String> getAllTareas() {
        return tareas;
    }

    @PostMapping
    public String createTarea(@RequestBody String tarea) {
        tareas.add(tarea);
        return "Tarea agregada: " + tarea;
    }

    @DeleteMapping("/{index}")
    public String deleteTarea(@PathVariable int index) {
        if (index >= 0 && index < tareas.size()) {
            String eliminada = tareas.remove(index);
            return "Tarea eliminada: " + eliminada;
        } else {
            return "Índice no válido";
        }
    }
}
