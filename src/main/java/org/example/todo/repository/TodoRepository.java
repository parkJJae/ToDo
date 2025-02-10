package org.example.todo.repository;

import org.example.todo.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDoEntity, Long> {
// 투두 엔티티의 ID 타입이 Long이라는 뜻.
}
