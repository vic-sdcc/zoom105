/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.particular;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@RequestScoped
public class particularAData extends particular implements Serializable {

    public particularAData() {

    }

    public List<Integer> scAComplete(String query) {
        return emf.createEntityManager().createQuery("SELECT c.scAcctno FROM CoopApplicant c "
                + "WHERE CONCAT(c.scAcctno,'') LIKE '%" + query + "%'").getResultList();
    }

    public List<String> nAComplete(String query) {
        return emf.createEntityManager().createQuery("SELECT CONCAT(c.lastName,', ',c.firstName,' ',c.middleName) FROM CoopApplicant c WHERE "
                + "UPPER(c.lastName) LIKE UPPER('%" + query + "%') "
                + "or UPPER(c.firstName) LIKE UPPER('%" + query + "%') "
                + "or UPPER(c.middleName) LIKE UPPER('%" + query + "%')").getResultList();
    }

}
