/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import dao.AdministradorDAO;
import entidades.Administrador;

/**
 *
 * @author noemi
 */
public class Test {
    
    public static void main(String[] args){
        Administrador admn = new Administrador();
        admn.setCpf("705.377.694-80");
        admn.setNome("Maria");
        admn.setSenha("123");
        
        AdministradorDAO dao = new AdministradorDAO();
        dao.save(admn);
        
    
         
    }

    
    
}
