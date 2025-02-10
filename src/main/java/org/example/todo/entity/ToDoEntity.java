package org.example.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // 데이터베이스 테이블과 연결됨
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ToDoEntity {
    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 ID
    private int id;

    private String title;
    private boolean completed;

}
