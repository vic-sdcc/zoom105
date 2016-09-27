/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
public class particular implements Serializable{

    @PersistenceUnit
    public EntityManagerFactory emf;
    
    private Integer scAccount;
    private String wName;
    
    public particular() {
        
    }    
    

    public Integer getScAccount() {
        return scAccount;
    }

    public void setScAccount(Integer scAccount) {
        this.scAccount = scAccount;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    
    
}
