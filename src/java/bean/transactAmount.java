/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@RequestScoped
public class transactAmount {
    
    //create new list of transaction amount
    private ArrayList<String> transAmount;

    public transactAmount() {
    }

    public void listLength(int length) {
        for (int i = 0; i != length; i++) {
            getTransAmount().add(new String());
        }
    }

    public ArrayList<String> getTransAmount() {
        if (transAmount == null) {
            transAmount = new ArrayList<>();
        }
        return transAmount;
    }

}
