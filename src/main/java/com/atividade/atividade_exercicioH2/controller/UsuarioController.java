package com.atividade.atividade_exercicioH2.controller;

import com.atividade.atividade_exercicioH2.model.UsuarioGamer;
import com.atividade.atividade_exercicioH2.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor

public class UsuarioController {
    private final UsuarioService service;

    @GetMapping
    public List<UsuarioGamer> listar() {
        return  service.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioGamer> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorID(id));
    }
    @PostMapping
    public ResponseEntity<UsuarioGamer> salvar(@RequestBody UsuarioGamer usuarioGamer){
        return ResponseEntity.ok(service.salvar(usuarioGamer));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UsuarioGamer> atualizar(@PathVariable Long id, @RequestBody UsuarioGamer dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
