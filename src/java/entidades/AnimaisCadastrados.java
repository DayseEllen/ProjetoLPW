/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dayse Ellen
 * @author Noemi Alves
 * @author Marina Leticia
 */
@Entity
public class AnimaisCadastrados extends Animal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idanimaiscadastrados;
    @ManyToOne
    @JoinColumn(name="Dono") 
    private Usuario dono;

    public AnimaisCadastrados() {
        
    }
    
    

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }
    

    public Long getIdanimaisadastrados() {
        return idanimaiscadastrados;
    }

    public void setIdanimaiscadastrados(Long idanimaiscadastrados) {
        this.idanimaiscadastrados = idanimaiscadastrados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idanimaiscadastrados);
        hash = 59 * hash + Objects.hashCode(this.dono);
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
        final AnimaisCadastrados other = (AnimaisCadastrados) obj;
        if (!Objects.equals(this.idanimaiscadastrados, other.idanimaiscadastrados)) {
            return false;
        }
        if (!Objects.equals(this.dono, other.dono)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnimaisCadastrados{" + "idanimaiscadastrados=" + idanimaiscadastrados + ", dono=" + dono + '}';
    }
    
    
    
}
