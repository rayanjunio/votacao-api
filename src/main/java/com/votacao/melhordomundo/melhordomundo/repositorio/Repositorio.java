package com.votacao.melhordomundo.melhordomundo.repositorio;

import com.votacao.melhordomundo.melhordomundo.modelo.Jogador;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends CrudRepository<Jogador, Integer> {

    List<Jogador> findAll();

    Jogador findByCredencial(int credencial);

    //ACRESCENTANDO VOTO AO BANCO DE DADOS
     default void acrescentarVoto(int credencial) {
        Jogador obj = findByCredencial(credencial);

        if(obj != null) {
            obj.setVotos(obj.getVotos() + 1);
            save(obj);
        }
    }
}
