/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;
import Modelos.Resposta;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Erick
 */
public class RespostaDAO {
    public void salvar(Resposta resposta )  {
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        if(resposta.getId()==0)
            sessao.saveOrUpdate(resposta);
        else
            sessao.merge(resposta);
}  

    
    public List<Resposta> listar(){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        return sessao.createCriteria(Resposta.class).list();
    }

    
    public void remover(Resposta resposta )  {
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.delete(resposta);
}  

    public Resposta carregar(int id){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        return (Resposta)sessao.load(Resposta.class, id);
        
    }

    public Resposta getByCPF(String cpf){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        Query createQuery = sessao.createQuery("FROM Resposta WHERE id=:id");
        createQuery.setString("id", cpf);
        
        return (Resposta)createQuery.uniqueResult();
        
    }
}
