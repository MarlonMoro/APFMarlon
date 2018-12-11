/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Contagem;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import static util.HibernateUtil.getSessionFactory;

/**
 *
 * @author Marlon Moro
 */
public class ContagemDAO {
    
    Contagem contagem;

    public ContagemDAO() {
    }

    public ContagemDAO(Contagem contagem) {
        this.contagem = contagem;
    }
    
    public int salvar(Contagem contagem){
        
        int idAux;
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        idAux = (Integer) session.save(contagem);
        session.getTransaction().commit();
        session.flush();
        session.close();
        return idAux;
    }
    
    public Contagem buscaID(int id){
        Session session = getSessionFactory().openSession();
        
        Contagem busca;
        busca = (Contagem) session.get(Contagem.class , id);
        session.flush();
        session.close();
        return busca;
    }
    
    public void atualiza(Contagem contagem){
        Session session = getSessionFactory().openSession();
        
        session.beginTransaction();
        session.merge(contagem);
        session.getTransaction().commit();
        session.flush();
        session.close();
    }
    
    public Contagem getContagem() {
        return contagem;
    }

    public void setContagem(Contagem contagem) {
        this.contagem = contagem;
    }
    
    
    
}
