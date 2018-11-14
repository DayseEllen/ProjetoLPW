/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionFactory;
import entidades.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author noemi
 */
public class UsuarioDAO {
     
    public Usuario save(Usuario user){
       EntityManager em = new ConnectionFactory().getConnection();        
        try{
         em.getTransaction().begin();
         em.persist(user);
         em.getTransaction().commit();
        }catch(Exception e){
         System.err.println(e);
         em.getTransaction().rollback();
        }finally{
         em.close();
        }
       return user; 
    }
    
}
