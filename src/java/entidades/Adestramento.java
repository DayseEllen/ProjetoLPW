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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;
/**
 *
 * @author Dayse Ellen
 * @author Noemi Alves
 * @author Marina Leticia
 */
@Entity
public class Adestramento extends Servico  {
    
    private Calendar duaracao;

    public Adestramento() {
    }

    
    @Override
    public String toString() {
        return "Adestramento{" + "Código adestramento=" +  '}';
    }
   

   

    public Calendar getDuaracao() {
        return duaracao;
    }

    public void setDuaracao(Calendar duaracao) {
        this.duaracao = duaracao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.duaracao);
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
        final Adestramento other = (Adestramento) obj;
        if (!Objects.equals(this.duaracao, other.duaracao)) {
            return false;
        }
        return true;
    }

   
    
   
   

    
    

    
}
