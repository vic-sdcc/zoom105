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
@Table(name = "coop_prospect")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopProspect.findAll", query = "SELECT c FROM CoopProspect c"),
    @NamedQuery(name = "CoopProspect.findByProspectNo", query = "SELECT c FROM CoopProspect c WHERE c.prospectNo = :prospectNo"),
    @NamedQuery(name = "CoopProspect.findByLastName", query = "SELECT c FROM CoopProspect c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "CoopProspect.findByFirstName", query = "SELECT c FROM CoopProspect c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "CoopProspect.findByMiddleName", query = "SELECT c FROM CoopProspect c WHERE c.middleName = :middleName"),
    @NamedQuery(name = "CoopProspect.findByGender", query = "SELECT c FROM CoopProspect c WHERE c.gender = :gender"),
    @NamedQuery(name = "CoopProspect.findByBirthdate", query = "SELECT c FROM CoopProspect c WHERE c.birthdate = :birthdate"),
    @NamedQuery(name = "CoopProspect.findByStreet", query = "SELECT c FROM CoopProspect c WHERE c.street = :street"),
    @NamedQuery(name = "CoopProspect.findByBarangay", query = "SELECT c FROM CoopProspect c WHERE c.barangay = :barangay"),
    @NamedQuery(name = "CoopProspect.findByCityMun", query = "SELECT c FROM CoopProspect c WHERE c.cityMun = :cityMun"),
    @NamedQuery(name = "CoopProspect.findByContactNumber", query = "SELECT c FROM CoopProspect c WHERE c.contactNumber = :contactNumber"),
    @NamedQuery(name = "CoopProspect.findByLengthOfStay", query = "SELECT c FROM CoopProspect c WHERE c.lengthOfStay = :lengthOfStay"),
    @NamedQuery(name = "CoopProspect.findByOccupation", query = "SELECT c FROM CoopProspect c WHERE c.occupation = :occupation"),
    @NamedQuery(name = "CoopProspect.findByProsDate", query = "SELECT c FROM CoopProspect c WHERE c.prosDate = :prosDate"),
    @NamedQuery(name = "CoopProspect.findByProsStat", query = "SELECT c FROM CoopProspect c WHERE c.prosStat = :prosStat"),
    @NamedQuery(name = "CoopProspect.findByNationality", query = "SELECT c FROM CoopProspect c WHERE c.nationality = :nationality"),
    @NamedQuery(name = "CoopProspect.findBySuffix", query = "SELECT c FROM CoopProspect c WHERE c.suffix = :suffix")})
public class CoopProspect implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prospect_no")
    private Integer prospectNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 20)
    @Column(name = "middle_name")
    private String middleName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gender")
    private Character gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Size(max = 60)
    @Column(name = "street")
    private String street;
    @Size(max = 50)
    @Column(name = "barangay")
    private String barangay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "city_mun")
    private String cityMun;
    @Size(max = 12)
    @Column(name = "contact_number")
    private String contactNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "length_of_stay")
    private boolean lengthOfStay;
    @Size(max = 50)
    @Column(name = "occupation")
    private String occupation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pros_date")
    @Temporal(TemporalType.DATE)
    private Date prosDate;
    @Column(name = "pros_stat")
    private Character prosStat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nationality")
    private boolean nationality;
    @Size(max = 5)
    @Column(name = "suffix")
    private String suffix;
    @OneToMany(mappedBy = "prospectNo")
    private Collection<CoopApplicant> coopApplicantCollection;
    @JoinColumn(name = "ou_code", referencedColumnName = "ou_code")
    @ManyToOne
    private CoopOrgUnit ouCode;

    public CoopProspect() {
    }

    public CoopProspect(Integer prospectNo) {
        this.prospectNo = prospectNo;
    }

    public CoopProspect(Integer prospectNo, String lastName, String firstName, Character gender, Date birthdate, String cityMun, boolean lengthOfStay, Date prosDate, boolean nationality) {
        this.prospectNo = prospectNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.cityMun = cityMun;
        this.lengthOfStay = lengthOfStay;
        this.prosDate = prosDate;
        this.nationality = nationality;
    }

    public Integer getProspectNo() {
        return prospectNo;
    }

    public void setProspectNo(Integer prospectNo) {
        this.prospectNo = prospectNo;
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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCityMun() {
        return cityMun;
    }

    public void setCityMun(String cityMun) {
        this.cityMun = cityMun;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(boolean lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getProsDate() {
        return prosDate;
    }

    public void setProsDate(Date prosDate) {
        this.prosDate = prosDate;
    }

    public Character getProsStat() {
        return prosStat;
    }

    public void setProsStat(Character prosStat) {
        this.prosStat = prosStat;
    }

    public boolean getNationality() {
        return nationality;
    }

    public void setNationality(boolean nationality) {
        this.nationality = nationality;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @XmlTransient
    public Collection<CoopApplicant> getCoopApplicantCollection() {
        return coopApplicantCollection;
    }

    public void setCoopApplicantCollection(Collection<CoopApplicant> coopApplicantCollection) {
        this.coopApplicantCollection = coopApplicantCollection;
    }

    public CoopOrgUnit getOuCode() {
        return ouCode;
    }

    public void setOuCode(CoopOrgUnit ouCode) {
        this.ouCode = ouCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prospectNo != null ? prospectNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopProspect)) {
            return false;
        }
        CoopProspect other = (CoopProspect) object;
        if ((this.prospectNo == null && other.prospectNo != null) || (this.prospectNo != null && !this.prospectNo.equals(other.prospectNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopProspect[ prospectNo=" + prospectNo + " ]";
    }
    
}
