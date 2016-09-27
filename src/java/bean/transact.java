/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@RequestScoped
public class transact implements Serializable{

    /**
     * Creates a new instance of transact
     */
    public transact() {

    }

    public void transactDeposit(String chartOfAccount) {
        System.out.println("value: " + chartOfAccount);
    }
    
    public void transactWithdraw(String chartOfAccount) {
        System.out.println("value: " + chartOfAccount);
    }

}
