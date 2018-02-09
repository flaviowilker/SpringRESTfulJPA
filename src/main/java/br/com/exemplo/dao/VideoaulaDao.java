package br.com.exemplo.dao;

import java.util.List;

import br.com.exemplo.domain.Videoaula;

public interface VideoaulaDao {

    void save(Videoaula videoaula);

    void update(Videoaula videoaula);

    void delete(Videoaula videoaula);

    Videoaula findByIdVideoaulaAndIdCurso(Long idVideoaula, Long idCurso);

    List<Videoaula> findAllByCurso(Long idCurso, String fields);

}
