/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@ViewScoped
public class printViewValue implements Serializable{

    public printViewValue() {
        
    }
    
    public void printViewI(int value){
        System.out.println("Value: " + value);
    }
    
    public void printViewS(String value){
        System.out.println("Value: " + value);
    }
    
}
