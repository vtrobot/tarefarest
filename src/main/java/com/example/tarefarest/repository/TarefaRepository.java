package com.example.tarefarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tarefarest.model.Tarefa;



@Repository
public interface  TarefaRepository extends JpaRepository <Tarefa, Long> {

}
