package me.dio.academia.digital.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

    /**
     * @param bairro bairro referência para filtro
     * @return Lista de alunos matriculados que residem no bairro passado como parâmetro
     */
    
     List<Matricula> findByAlunoBairro(String bairro);

}
