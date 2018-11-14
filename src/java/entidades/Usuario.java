/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Dayse Ellen
 * @author Noemi Alves
 * @author Marina Leticia
 */
@Entity
public class Usuario extends Pessoa implements Serializable{

    private Calendar dtNasc;
    @OneToOne
    private Endereco endereco;
    @OneToMany (mappedBy = "user")
    private List<Contato> contato = new ArrayList<>();
    
    @OneToMany (mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();
    
    @OneToMany (mappedBy = "doador")
    private List<AnimaisAdocao> animaisadocao = new ArrayList<>();
    
    @OneToMany (mappedBy = "dono")
    private List<AnimaisCadastrados> animaiscadastrados = new ArrayList<>();
 
    public Usuario() {
    }
    
    

    public Calendar getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Calendar dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContato() {
        return contato;
    }

    public void setContato(ArrayList<Contato> contato) {
        this.contato = contato;
    }

    public List<AnimaisAdocao> getAnimaisadocao() {
        return animaisadocao;
    }

    public void setAnimaisadocao(ArrayList<AnimaisAdocao> animaisadocao) {
        this.animaisadocao = animaisadocao;
    }

    public List<AnimaisCadastrados> getAnimaiscadastrados() {
        return animaiscadastrados;
    }

    public void setAnimaiscadastrados(ArrayList<AnimaisCadastrados> animaiscadastrados) {
        this.animaiscadastrados = animaiscadastrados;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dtNasc);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.contato);
        hash = 47 * hash + Objects.hashCode(this.pedidos);
        hash = 47 * hash + Objects.hashCode(this.animaisadocao);
        hash = 47 * hash + Objects.hashCode(this.animaiscadastrados);
        return hash;
    }

    @Override
    public String toString() {
        return "Usuario{" + "dtNasc=" + dtNasc + ", endereco=" + endereco + ", contato=" + contato + ", pedidos=" + pedidos + ", animaisadocao=" + animaisadocao + ", animaiscadastrados=" + animaiscadastrados + '}';
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.dtNasc, other.dtNasc)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        if (!Objects.equals(this.animaisadocao, other.animaisadocao)) {
            return false;
        }
        if (!Objects.equals(this.animaiscadastrados, other.animaiscadastrados)) {
            return false;
        }
        return true;
    }

    

   
    
    
    

    @Override
    public boolean Autentica(String email, String senha) {
        return false;
    }
    
    
}
