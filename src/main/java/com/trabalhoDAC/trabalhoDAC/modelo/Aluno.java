/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabalhoDAC.trabalhoDAC.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author guilherme
 */
@Entity
public class Aluno extends Usuario implements Serializable {

    @OneToMany
    private Disciplina disciplina;
    @OneToMany
    private Projeto projeto;
    private List<String> interesses;

    public Aluno(String nome, String cpf, String endereco, String telefone, String matricula, String login, String senha, boolean autorizado) {
        super(nome, cpf, endereco, telefone, matricula, login, senha, autorizado);
    }

    public Aluno() {
        super();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

}