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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vic
 */
@Entity
@Table(name = "coop_finance_special_accounts_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findAll", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findBySprofileId", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.sprofileId = :sprofileId"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findByLastName", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findByFirstName", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findByMiddleName", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.middleName = :middleName"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findByBirthdate", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.birthdate = :birthdate"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findByDateAdded", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.dateAdded = :dateAdded"),
    @NamedQuery(name = "CoopFinanceSpecialAccountsProfile.findBySsc", query = "SELECT c FROM CoopFinanceSpecialAccountsProfile c WHERE c.ssc = :ssc")})
public class CoopFinanceSpecialAccountsProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sprofile_id")
    private Integer sprofileId;
    @Size(max = 2147483647)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 2147483647)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 2147483647)
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;
    @Size(max = 2147483647)
    @Column(name = "ssc")
    private String ssc;

    public CoopFinanceSpecialAccountsProfile() {
    }

    public CoopFinanceSpecialAccountsProfile(Integer sprofileId) {
        this.sprofileId = sprofileId;
    }

    public CoopFinanceSpecialAccountsProfile(Integer sprofileId, Date dateAdded) {
        this.sprofileId = sprofileId;
        this.dateAdded = dateAdded;
    }

    public Integer getSprofileId() {
        return sprofileId;
    }

    public void setSprofileId(Integer sprofileId) {
        this.sprofileId = sprofileId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sprofileId != null ? sprofileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopFinanceSpecialAccountsProfile)) {
            return false;
        }
        CoopFinanceSpecialAccountsProfile other = (CoopFinanceSpecialAccountsProfile) object;
        if ((this.sprofileId == null && other.sprofileId != null) || (this.sprofileId != null && !this.sprofileId.equals(other.sprofileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopFinanceSpecialAccountsProfile[ sprofileId=" + sprofileId + " ]";
    }
    
}
