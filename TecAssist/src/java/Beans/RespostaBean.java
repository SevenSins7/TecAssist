/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import Modelos.Resposta;
import Persistencia.RespostaDAO;

/**
 *
 * @author Erick
 */
@ManagedBean()
@ViewScoped
public class RespostaBean {
    private Resposta resposta;
    private List<Resposta> respostas;

    RespostaDAO respostaDAO = new RespostaDAO();

    public RespostaBean() {
        respostas = respostaDAO.listar();
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public void salvar() {
        respostaDAO.salvar(resposta);
        respostas = respostaDAO.listar();
    }

    public void carregar(int id) {
        resposta = respostaDAO.carregar(id);
    }

    public void remover(Resposta resposta) {
        respostaDAO.remover(resposta);
        respostas = respostaDAO.listar();
    }

    public void novo() {
        resposta = new Resposta();
    }
}
