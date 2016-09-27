/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.CoopInfo;
import service.CoopInfoFacadeREST;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
public class formHeader implements Serializable{
    
    //form Header

    @EJB
    private CoopInfoFacadeREST coopInfoFacadeREST;
    private List<CoopInfo> infoList;
    
    public formHeader() {
        
    }
    
    public List<CoopInfo> getInfoList() {
        infoList = coopInfoFacadeREST.findAll();
        return infoList;
    }

    public void setInfoList(List<CoopInfo> infoList) {
        this.infoList = infoList;
    }
    
}
