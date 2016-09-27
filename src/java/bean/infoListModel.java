package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import model.CoopInfo;
import service.CoopInfoFacadeREST;

@ManagedBean
@SessionScoped
public class infoListModel implements Serializable {

    @EJB
    private CoopInfoFacadeREST coopInfoFacadeREST;
    private List<CoopInfo> infoList;
    private ArrayList<CoopInfo> infoArrList;
    private DataModel<CoopInfo> infoModel;
    private CoopInfo info;
    private CoopInfo selectedInfo;

    public infoListModel() {

    }

    public void beanclear() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("infoListModel", null);
    }

    public List<CoopInfo> getInfoList() {
        if (infoList == null) {
            infoList = coopInfoFacadeREST.findAll();
        }
        return infoList;
    }

    public void setInfoList(List<CoopInfo> infoList) {
        this.infoList = infoList;
    }

    public ArrayList<CoopInfo> getInfoArrList() {
        if (infoArrList == null) {
            infoArrList = new ArrayList<>();
        }
        return infoArrList;
    }

    public void setInfoArrList(ArrayList<CoopInfo> infoArrList) {
        this.infoArrList = infoArrList;
    }

    public DataModel<CoopInfo> getInfoModel() {
        if (infoModel == null) {
            infoModel = new ListDataModel<>(getInfoList());
        }
        return infoModel;
    }

    public void setInfoModel(DataModel<CoopInfo> infoModel) {
        this.infoModel = infoModel;
    }

    public CoopInfo getInfo() {
        if (info == null) {
            info = new CoopInfo();
        }
        return info;
    }

    public void setInfo(CoopInfo info) {
        this.info = info;
    }

    public CoopInfo getSelectedInfo() {
        if (selectedInfo == null) {
            selectedInfo = new CoopInfo();
        }
        return selectedInfo;
    }

    public void setSelectedInfo(CoopInfo selectedInfo) {
        this.selectedInfo = selectedInfo;
    }

}
