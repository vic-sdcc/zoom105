/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
//Consolidates all transaction values
public class transactData {

    private oneMenuValue oneMenuValue;
    private transactAmount transactAmount;

    public transactData() {

    }

    public oneMenuValue getOneMenuValue() {
        if (oneMenuValue == null) {
            oneMenuValue = new oneMenuValue();
        }
        return oneMenuValue;
    }

    public transactAmount getTransactAmount() {
        if (transactAmount == null) {
            transactAmount = new transactAmount();
        }
        return transactAmount;
    }

}
