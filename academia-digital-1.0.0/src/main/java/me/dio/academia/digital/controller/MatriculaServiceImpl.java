package me.dio.academia.digital.controller;

import org.hibernate.mapping.List;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;

public class MatriculaServiceImpl implements IMatriculaService{

    public List<Matricula> getAllS(String bairro) {

        if (bairro == null){
            return MatriculaRepository.findAll();
        } else{
            return MatriculaRepository.findByAlunoBairro(bairro);
        }
       
    }

    @Override
    public Matricula create(MatriculaForm form) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Matricula get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
