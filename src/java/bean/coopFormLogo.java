/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.ByteArrayInputStream;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import service.CoopInfoFacadeREST;

/**
 *
 * @author vic
 */
@ManagedBean
@NoneScoped
public class coopFormLogo {

    @EJB
    private CoopInfoFacadeREST coopInfoFacadeREST;
    private StreamedContent coopLogo;

    public coopFormLogo() {

    }

    public StreamedContent getCoopLogo() {
        coopLogo = new DefaultStreamedContent(new ByteArrayInputStream(coopInfoFacadeREST.find(1).getLogo()), "image/png");
        return coopLogo;
    }

    public void setCoopLogo(StreamedContent coopLogo) {
        this.coopLogo = coopLogo;
    }

}
