package org.example.todo.service;

import org.example.todo.entity.ToDoEntity;
import org.example.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Controller와 Repository 사이에서 데이터를 처리하는 역할
@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<ToDoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    public ToDoEntity createTodo(ToDoEntity todoentity){
        return todoRepository.save(todoentity);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
