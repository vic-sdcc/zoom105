/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vic
 */
@Entity
@Table(name = "coop_finance_saving_account_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopFinanceSavingAccountProfile.findAll", query = "SELECT c FROM CoopFinanceSavingAccountProfile c"),
    @NamedQuery(name = "CoopFinanceSavingAccountProfile.findBySdNo", query = "SELECT c FROM CoopFinanceSavingAccountProfile c WHERE c.sdNo = :sdNo"),
    @NamedQuery(name = "CoopFinanceSavingAccountProfile.findByDateAdded", query = "SELECT c FROM CoopFinanceSavingAccountProfile c WHERE c.dateAdded = :dateAdded")})
public class CoopFinanceSavingAccountProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sd_no")
    private Integer sdNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;
    @JoinColumn(name = "sa_account", referencedColumnName = "sc_account")
    @ManyToOne
    private CoopFinanceSharecapitalAccountProfile saAccount;
    @JoinColumn(name = "profile_id", referencedColumnName = "profile_id")
    @ManyToOne
    private CoopFinanceAccountProfile profileId;

    public CoopFinanceSavingAccountProfile() {
    }

    public CoopFinanceSavingAccountProfile(Integer sdNo) {
        this.sdNo = sdNo;
    }

    public CoopFinanceSavingAccountProfile(Integer sdNo, Date dateAdded) {
        this.sdNo = sdNo;
        this.dateAdded = dateAdded;
    }

    public Integer getSdNo() {
        return sdNo;
    }

    public void setSdNo(Integer sdNo) {
        this.sdNo = sdNo;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public CoopFinanceSharecapitalAccountProfile getSaAccount() {
        return saAccount;
    }

    public void setSaAccount(CoopFinanceSharecapitalAccountProfile saAccount) {
        this.saAccount = saAccount;
    }

    public CoopFinanceAccountProfile getProfileId() {
        return profileId;
    }

    public void setProfileId(CoopFinanceAccountProfile profileId) {
        this.profileId = profileId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sdNo != null ? sdNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopFinanceSavingAccountProfile)) {
            return false;
        }
        CoopFinanceSavingAccountProfile other = (CoopFinanceSavingAccountProfile) object;
        if ((this.sdNo == null && other.sdNo != null) || (this.sdNo != null && !this.sdNo.equals(other.sdNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopFinanceSavingAccountProfile[ sdNo=" + sdNo + " ]";
    }
    
}
