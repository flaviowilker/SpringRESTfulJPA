package br.com.exemplo.service;

import java.util.Date;
import java.util.List;

import br.com.exemplo.domain.Curso;

public interface CursoService {

    void save(Curso curso);

    void update(Long id, Curso curso);

    void delete(Long id);

    Curso findById(Long id);

    List<Curso> findAll();

    Curso updateDataInicio(Long id, Date dataInicio);
}
