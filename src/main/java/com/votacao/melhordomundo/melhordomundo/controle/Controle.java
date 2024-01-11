package com.votacao.melhordomundo.melhordomundo.controle;

import com.votacao.melhordomundo.melhordomundo.modelo.Jogador;
import com.votacao.melhordomundo.melhordomundo.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controle {

    //INJEÇÃO DE DEPENDÊNCIA
    @Autowired
    private Repositorio acao;

    //VOTAR
    @PostMapping("/api/votar")
    public ResponseEntity votar(@RequestBody int credencial) {
        acao.acrescentarVoto(credencial);
        return ResponseEntity.ok("Voto registrado com sucesso!");
    }

    //EDITAR
    @PutMapping("/api/editar")
    public ResponseEntity editar(@RequestBody Jogador obj) {
        acao.save(obj);
        return ResponseEntity.ok("Jogador atualizado com sucesso!");
    }

    //EXIBINDO TODOS OS JOGADORES
    @GetMapping("/api/exibir-jogadores")
    public List<Jogador> exibirJogadores() {
        return acao.findAll();
    }

    //SELECIONAR JOGADOR PELO ID
    @GetMapping("/api/selecionar-credencial/{credencial}")
    public Jogador selecionarPelaCredencial(@PathVariable int credencial) {
        return acao.findByCredencial(credencial);
    }

    //EXCLUINDO JOGADOR
    @DeleteMapping("/api/excluir-jogador/{credencial}")
    public void excluirJogador(@PathVariable int credencial) {
        Jogador jogadorARemover = selecionarPelaCredencial(credencial);

        acao.delete(jogadorARemover);
    }
}
