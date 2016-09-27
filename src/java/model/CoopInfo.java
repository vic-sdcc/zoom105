/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vic
 */
@Entity
@Table(name = "coop_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopInfo.findAll", query = "SELECT c FROM CoopInfo c"),
    @NamedQuery(name = "CoopInfo.findByName", query = "SELECT c FROM CoopInfo c WHERE c.name = :name"),
    @NamedQuery(name = "CoopInfo.findByTelephone", query = "SELECT c FROM CoopInfo c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "CoopInfo.findByTelefax", query = "SELECT c FROM CoopInfo c WHERE c.telefax = :telefax"),
    @NamedQuery(name = "CoopInfo.findByEmail1", query = "SELECT c FROM CoopInfo c WHERE c.email1 = :email1"),
    @NamedQuery(name = "CoopInfo.findByEmail2", query = "SELECT c FROM CoopInfo c WHERE c.email2 = :email2"),
    @NamedQuery(name = "CoopInfo.findByEmail3", query = "SELECT c FROM CoopInfo c WHERE c.email3 = :email3"),
    @NamedQuery(name = "CoopInfo.findByAddress", query = "SELECT c FROM CoopInfo c WHERE c.address = :address"),
    @NamedQuery(name = "CoopInfo.findByInfoNo", query = "SELECT c FROM CoopInfo c WHERE c.infoNo = :infoNo")})
public class CoopInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name")
    private String name;
    @Size(max = 30)
    @Column(name = "telephone")
    private String telephone;
    @Size(max = 30)
    @Column(name = "telefax")
    private String telefax;
    @Size(max = 50)
    @Column(name = "email_1")
    private String email1;
    @Size(max = 50)
    @Column(name = "email_2")
    private String email2;
    @Size(max = 50)
    @Column(name = "email_3")
    private String email3;
    @Size(max = 2147483647)
    @Column(name = "address")
    private String address;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "info_no")
    private Integer infoNo;

    public CoopInfo() {
    }

    public CoopInfo(Integer infoNo) {
        this.infoNo = infoNo;
    }

    public CoopInfo(Integer infoNo, String name) {
        this.infoNo = infoNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public Integer getInfoNo() {
        return infoNo;
    }

    public void setInfoNo(Integer infoNo) {
        this.infoNo = infoNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoNo != null ? infoNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopInfo)) {
            return false;
        }
        CoopInfo other = (CoopInfo) object;
        if ((this.infoNo == null && other.infoNo != null) || (this.infoNo != null && !this.infoNo.equals(other.infoNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopInfo[ infoNo=" + infoNo + " ]";
    }
    
}
