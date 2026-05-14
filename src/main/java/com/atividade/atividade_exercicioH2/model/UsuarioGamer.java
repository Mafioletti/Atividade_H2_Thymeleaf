package com.atividade.atividade_exercicioH2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioGamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String email;
    private String jogoFavorito;
    private Integer nivelJogador;

    public Integer getNivelJogador() {
        return nivelJogador;
    }

    public void setNivelJogador(Integer nivelJogador) {
        this.nivelJogador = nivelJogador;
    }

    public String getJogoFavorito() {
        return jogoFavorito;
    }

    public void setJogoFavorito(String jogoFavorito) {
        this.jogoFavorito = jogoFavorito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}