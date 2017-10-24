/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import Modelos.Aluno;
import Persistencia.AlunoDAO;
/**
 *
 * @author Erick
 */
@ManagedBean()
@ViewScoped
public class AlunoBean {
    private Aluno aluno;
    private List<Aluno> Alunos;

    AlunoDAO AlunoDAO = new AlunoDAO();

    public AlunoBean() {
        Alunos = AlunoDAO.listar();
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> Alunos) {
        this.Alunos = Alunos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void salvar() {
        AlunoDAO.salvar(aluno);
        Alunos = AlunoDAO.listar();
    }

    public void carregar(int id) {
        aluno = AlunoDAO.carregar(id);
    }

    public void remover(Aluno aluno) {
        AlunoDAO.remover(aluno);
        Alunos = AlunoDAO.listar();
    }

    public void novo() {
        aluno = new Aluno();
    }
}
