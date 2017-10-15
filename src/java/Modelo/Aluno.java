/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author anderson
 */
public class Aluno {
    
    private long id;
    private String nome;
    private String audio_nome;
    private String foto_aluno;
    private Turma turma_id;

    public Aluno(long id, String nome, String audio_nome, String foto_aluno, Turma turma_id) {
        this.id = id;
        this.nome = nome;
        this.audio_nome = audio_nome;
        this.foto_aluno = foto_aluno;
        this.turma_id = turma_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAudio_nome() {
        return audio_nome;
    }

    public void setAudio_nome(String audio_nome) {
        this.audio_nome = audio_nome;
    }

    public String getFoto_aluno() {
        return foto_aluno;
    }

    public void setFoto_aluno(String foto_aluno) {
        this.foto_aluno = foto_aluno;
    }

    public Turma getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(Turma turma_id) {
        this.turma_id = turma_id;
    }
    
    
}
