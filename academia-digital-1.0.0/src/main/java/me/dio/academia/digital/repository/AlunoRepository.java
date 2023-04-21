package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.controller.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    Aluno save(me.dio.academia.digital.entity.Aluno aluno);



}
