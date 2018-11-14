/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Administrador;
import conexao.ConnectionFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author noemi
 */
public class AdministradorDAO {
    
    public Administrador save(Administrador dono){
       EntityManager em = new ConnectionFactory().getConnection();        
        try{
         em.getTransaction().begin();
         em.persist(dono);
         em.getTransaction().commit();
        }catch(Exception e)
        {
            System.err.println(e);
         em.getTransaction().rollback();
        }finally{
         em.close();
        }
       return dono; 
    }
}
