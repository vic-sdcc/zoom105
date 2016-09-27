/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vic
 */
@Entity
@Table(name = "coop_finance_sharecapital_account_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopFinanceSharecapitalAccountProfile.findAll", query = "SELECT c FROM CoopFinanceSharecapitalAccountProfile c"),
    @NamedQuery(name = "CoopFinanceSharecapitalAccountProfile.findByScapNo", query = "SELECT c FROM CoopFinanceSharecapitalAccountProfile c WHERE c.scapNo = :scapNo"),
    @NamedQuery(name = "CoopFinanceSharecapitalAccountProfile.findByScAccount", query = "SELECT c FROM CoopFinanceSharecapitalAccountProfile c WHERE c.scAccount = :scAccount"),
    @NamedQuery(name = "CoopFinanceSharecapitalAccountProfile.findByDateAdded", query = "SELECT c FROM CoopFinanceSharecapitalAccountProfile c WHERE c.dateAdded = :dateAdded")})
public class CoopFinanceSharecapitalAccountProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "scap_no")
    private int scapNo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sc_account")
    private Integer scAccount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;
    @JoinColumn(name = "profile_id", referencedColumnName = "profile_id")
    @ManyToOne
    private CoopFinanceAccountProfile profileId;
    @OneToMany(mappedBy = "saAccount")
    private Collection<CoopFinanceSavingAccountProfile> coopFinanceSavingAccountProfileCollection;

    public CoopFinanceSharecapitalAccountProfile() {
    }

    public CoopFinanceSharecapitalAccountProfile(Integer scAccount) {
        this.scAccount = scAccount;
    }

    public CoopFinanceSharecapitalAccountProfile(Integer scAccount, int scapNo, Date dateAdded) {
        this.scAccount = scAccount;
        this.scapNo = scapNo;
        this.dateAdded = dateAdded;
    }

    public int getScapNo() {
        return scapNo;
    }

    public void setScapNo(int scapNo) {
        this.scapNo = scapNo;
    }

    public Integer getScAccount() {
        return scAccount;
    }

    public void setScAccount(Integer scAccount) {
        this.scAccount = scAccount;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public CoopFinanceAccountProfile getProfileId() {
        return profileId;
    }

    public void setProfileId(CoopFinanceAccountProfile profileId) {
        this.profileId = profileId;
    }

    @XmlTransient
    public Collection<CoopFinanceSavingAccountProfile> getCoopFinanceSavingAccountProfileCollection() {
        return coopFinanceSavingAccountProfileCollection;
    }

    public void setCoopFinanceSavingAccountProfileCollection(Collection<CoopFinanceSavingAccountProfile> coopFinanceSavingAccountProfileCollection) {
        this.coopFinanceSavingAccountProfileCollection = coopFinanceSavingAccountProfileCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scAccount != null ? scAccount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopFinanceSharecapitalAccountProfile)) {
            return false;
        }
        CoopFinanceSharecapitalAccountProfile other = (CoopFinanceSharecapitalAccountProfile) object;
        if ((this.scAccount == null && other.scAccount != null) || (this.scAccount != null && !this.scAccount.equals(other.scAccount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopFinanceSharecapitalAccountProfile[ scAccount=" + scAccount + " ]";
    }
    
}
