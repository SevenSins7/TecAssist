/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;
import Modelos.Aluno;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Erick
 */
public class AlunoDAO {
    public void salvar(Aluno aluno )  {
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        if(aluno.getId()==0)
            sessao.saveOrUpdate(aluno);
        else
            sessao.merge(aluno);
}  

    
    public List<Aluno> listar(){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        return sessao.createCriteria(Aluno.class).list();
    }

    
    public void remover(Aluno aluno )  {
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.delete(aluno);
}  

    public Aluno carregar(int id){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        return (Aluno)sessao.load(Aluno.class, id);
        
    }

    public Aluno getByCPF(String cpf){
        Session sessao = Persistencia.HibernateUtil.getSessionFactory().getCurrentSession();
        Query createQuery = sessao.createQuery("FROM Aluno WHERE id=:id");
        createQuery.setString("id", cpf);
        
        return (Aluno)createQuery.uniqueResult();
        
    }
}
