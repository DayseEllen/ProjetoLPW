/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;

import javax.persistence.OneToMany;

/**
 *
 * @author Dayse Ellen
 * @author Noemi Alves
 * @author Marina Leticia
 */
@Entity
public class Administrador extends Pessoa implements Serializable{
   
    @OneToMany
    private List<AnimaisAdocao> animaisadocao = new ArrayList<>();
            
            
                                    
    
   

    public Administrador() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.animaisadocao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.animaisadocao, other.animaisadocao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "animaisadocao=" + animaisadocao + '}';
    }
    
    

   
    
    
  

   
    

    /**
     * @return the animaisadocao
     */
    public List<AnimaisAdocao> getAnimaisadocao() {
        return animaisadocao;
    }

    /**
     * @param animaisadocao the animaisadocao to set
     */
    public void setAnimaisadocao(ArrayList<AnimaisAdocao> animaisadocao) {
        this.animaisadocao = animaisadocao;
    }

    @Override
    public boolean Autentica(String email, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
