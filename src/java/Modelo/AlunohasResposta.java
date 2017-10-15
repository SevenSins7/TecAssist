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
public class AlunohasResposta {
 // O objeto aluno ja contem a turma
 // O objeto resposta ja contem a pergunta   
    private long id;
    private Aluno aluno;
    private Resposta resposta;

    public AlunohasResposta(long id, Aluno aluno, Resposta resposta) {
        this.id = id;
        this.aluno = aluno;
        this.resposta = resposta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }
    
    
    
    
    
    
}
