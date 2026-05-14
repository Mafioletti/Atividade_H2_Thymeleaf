package com.atividade.atividade_exercicioH2.service;

import com.atividade.atividade_exercicioH2.model.UsuarioGamer;
import com.atividade.atividade_exercicioH2.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    private final UsuarioRepository repository;

    public List<UsuarioGamer> listar(){
        return repository.findAll();
    }
    public UsuarioGamer buscarPorID(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
    public  UsuarioGamer salvar(UsuarioGamer usuarioGamer){
        return repository.save(usuarioGamer);
    }
    public UsuarioGamer atualizar(Long id, UsuarioGamer dados){
        UsuarioGamer usuarioGamer = buscarPorID(id);
        usuarioGamer.setNickname(dados.getNickname());
        usuarioGamer.setEmail(dados.getEmail());
        usuarioGamer.setJogoFavorito(dados.getJogoFavorito());
        usuarioGamer.setNivelJogador(dados.getNivelJogador());

        return repository.save(usuarioGamer);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
