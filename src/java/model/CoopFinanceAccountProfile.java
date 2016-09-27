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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vic
 */
@Entity
@Table(name = "coop_finance_account_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopFinanceAccountProfile.findAll", query = "SELECT c FROM CoopFinanceAccountProfile c"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByProfileId", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.profileId = :profileId"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByLastName", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByFirstName", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByMiddleName", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.middleName = :middleName"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByBirthdate", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.birthdate = :birthdate"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByMemberNo", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.memberNo = :memberNo"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findByDateAdded", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.dateAdded = :dateAdded"),
    @NamedQuery(name = "CoopFinanceAccountProfile.findBySsc", query = "SELECT c FROM CoopFinanceAccountProfile c WHERE c.ssc = :ssc")})
public class CoopFinanceAccountProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profile_id")
    private Integer profileId;
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
    @Size(max = 2147483647)
    @Column(name = "member_no")
    private String memberNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;
    @Size(max = 2147483647)
    @Column(name = "ssc")
    private String ssc;
    @JoinColumn(name = "applicant_no", referencedColumnName = "applicant_no")
    @ManyToOne
    private CoopApplicant applicantNo;
    @OneToMany(mappedBy = "profileId")
    private Collection<CoopFinanceSharecapitalAccountProfile> coopFinanceSharecapitalAccountProfileCollection;
    @OneToMany(mappedBy = "profileId")
    private Collection<CoopFinanceSavingAccountProfile> coopFinanceSavingAccountProfileCollection;

    public CoopFinanceAccountProfile() {
    }

    public CoopFinanceAccountProfile(Integer profileId) {
        this.profileId = profileId;
    }

    public CoopFinanceAccountProfile(Integer profileId, Date dateAdded) {
        this.profileId = profileId;
        this.dateAdded = dateAdded;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
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

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
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

    public CoopApplicant getApplicantNo() {
        return applicantNo;
    }

    public void setApplicantNo(CoopApplicant applicantNo) {
        this.applicantNo = applicantNo;
    }

    @XmlTransient
    public Collection<CoopFinanceSharecapitalAccountProfile> getCoopFinanceSharecapitalAccountProfileCollection() {
        return coopFinanceSharecapitalAccountProfileCollection;
    }

    public void setCoopFinanceSharecapitalAccountProfileCollection(Collection<CoopFinanceSharecapitalAccountProfile> coopFinanceSharecapitalAccountProfileCollection) {
        this.coopFinanceSharecapitalAccountProfileCollection = coopFinanceSharecapitalAccountProfileCollection;
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
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopFinanceAccountProfile)) {
            return false;
        }
        CoopFinanceAccountProfile other = (CoopFinanceAccountProfile) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopFinanceAccountProfile[ profileId=" + profileId + " ]";
    }
    
}
