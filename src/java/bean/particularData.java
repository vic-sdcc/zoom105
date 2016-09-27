/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.CoopApplicant;

/**
 *
 * @author vic
 */
@ManagedBean
@RequestScoped
public class particularData extends particular implements Serializable {

    public particularData() {

    }

    public void scComplete() {
        try {
            CoopApplicant a = (CoopApplicant) emf.createEntityManager().createQuery("SELECT c FROM CoopApplicant c "
                    + "WHERE c.scAcctno = : " + super.getScAccount()).getResultList().get(0);
            super.setwName(a.getLastName() + ", " + a.getFirstName() + " " + a.getMiddleName());
        } catch (Exception e) {
        }
    }

    public void nameComplete() {
        try {
            CoopApplicant a = (CoopApplicant) emf.createEntityManager().createQuery("SELECT c FROM CoopApplicant c "
                    + "WHERE CONCAT(c.lastName,', ',c.firstName,' ',c.middleName) = : '" + super.getwName() + "'").getResultList().get(0);
            super.setScAccount(a.getScAcctno());
        } catch (Exception e) {
        }

    }

}
