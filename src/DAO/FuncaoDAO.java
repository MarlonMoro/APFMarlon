/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Contagem;
import entities.Funcoes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import static util.HibernateUtil.getSessionFactory;

/**
 *
 * @author Marlon Moro
 */
public class FuncaoDAO {
    
    Funcoes funcao;

    public FuncaoDAO() {
    }

    public FuncaoDAO(Funcoes funcao) {
        this.funcao = funcao;
    }

    public Funcoes getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcoes funcao) {
        this.funcao = funcao;
    }
    
    
    public int salvar(Funcoes f){
        
        int idAux;
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        idAux = (Integer) session.save(f);
        session.getTransaction().commit();
        session.flush();
        session.close();
        return idAux;
    }
    
    public Funcoes buscaID(int id){
        Session session = getSessionFactory().openSession();
        
        Funcoes busca;
        busca = (Funcoes) session.get(Funcoes.class , id);
        session.flush();
        session.close();
        return busca;
    }
    
    public List<Funcoes> buscaTodos(Contagem contagem){
            
        ContagemDAO contagemDAO = new ContagemDAO();
        
        
        
        Session session = getSessionFactory().openSession();
        Criteria criterio = session.createCriteria(Funcoes.class);
        criterio.add(Restrictions.eq("contagem", contagemDAO.buscaID(contagem.getIdContagem())));
        List<Funcoes> listaFuncoes;
        listaFuncoes = new ArrayList<>();
        listaFuncoes = criterio.list();
        
        
        
        return listaFuncoes;
    }
    
}
