/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dayse Ellen
 * @author Noemi Alves
 * @author Marina Leticia
 */
@Entity
public class AnimaisAdocao extends Animal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idanimaisadocao;
    private Calendar idade;
    private String motivoadocao;
    @ManyToOne
    private Pessoa doador;

    public Pessoa getDoador() {
        return doador;
    }

    public void setDoador(Pessoa doador) {
        this.doador = doador;
    }

    public AnimaisAdocao() {
    }

    public Calendar getIdade() {
        return idade;
    }

    public void setIdade(Calendar idade) {
        this.idade = idade;
    }

    public String getMotivoadocao() {
        return motivoadocao;
    }

    public void setMotivoadocao(String motivoadocao) {
        this.motivoadocao = motivoadocao;
    }
    
    
    public Long getIdanimaisadocao() {
        return idanimaisadocao;
    }

    public void setIdanimaisadocao(Long idanimaisadocao) {
        this.idanimaisadocao = idanimaisadocao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idanimaisadocao);
        hash = 23 * hash + Objects.hashCode(this.idade);
        hash = 23 * hash + Objects.hashCode(this.motivoadocao);
        hash = 23 * hash + Objects.hashCode(this.doador);
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
        final AnimaisAdocao other = (AnimaisAdocao) obj;
        if (!Objects.equals(this.motivoadocao, other.motivoadocao)) {
            return false;
        }
        if (!Objects.equals(this.idanimaisadocao, other.idanimaisadocao)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.doador, other.doador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnimaisAdocao{" + "idanimaisadocao=" + idanimaisadocao + ", idade=" + idade + ", motivoadocao=" + motivoadocao + ", doador=" + doador + '}';
    }
    
    
 
    
    
}
