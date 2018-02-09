package br.com.exemplo.service;

import java.util.List;

import br.com.exemplo.domain.Videoaula;

public interface VideoaulaService {

    void save(Long idCurso, Videoaula videoaula);

    void update(Long idVideoaula, Long idCurso, Videoaula videoaula);

    void delete(Long idVideoaula, Long idCurso);

    Videoaula findByIdVideoaulaAndIdCurso(Long idVideoaula, Long idCurso);

    List<Videoaula> findAllByCurso(Long idCurso, String fields);
}
