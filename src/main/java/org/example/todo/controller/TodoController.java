package org.example.todo.controller;

import org.example.todo.entity.ToDoEntity;
import org.example.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    @GetMapping
    public List<ToDoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public ToDoEntity createTodo(@RequestBody ToDoEntity todoentity){
        return todoService.createTodo(todoentity);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }

}
