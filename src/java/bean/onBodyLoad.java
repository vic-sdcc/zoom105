/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
public class onBodyLoad implements Serializable{
    
    //preRender global class

    private UAgentInfo agent;
    
    public onBodyLoad() {
        
    }
    
    public void init(){
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        String userAgent = externalContext.getRequestHeaderMap().get("User-Agent");
        String accept = externalContext.getRequestHeaderMap().get("Accept");
        setAgent(new UAgentInfo(userAgent, accept));
    }

    public UAgentInfo getAgent() {
        return agent;
    }

    public void setAgent(UAgentInfo agent) {
        this.agent = agent;
    }
}
