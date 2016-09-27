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
@Table(name = "coop_finance_daily_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoopFinanceDailyTransactions.findAll", query = "SELECT c FROM CoopFinanceDailyTransactions c"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByTransNo", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.transNo = :transNo"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByChartOfAccount", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.chartOfAccount = :chartOfAccount"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByReferenceNo", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.referenceNo = :referenceNo"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByParticulars", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.particulars = :particulars"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByAmount", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.amount = :amount"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByEntryType", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.entryType = :entryType"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByTransDate", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.transDate = :transDate"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByTellerCode", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.tellerCode = :tellerCode"),
    @NamedQuery(name = "CoopFinanceDailyTransactions.findByBooktype", query = "SELECT c FROM CoopFinanceDailyTransactions c WHERE c.booktype = :booktype")})
public class CoopFinanceDailyTransactions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trans_no")
    private Integer transNo;
    @Size(max = 2147483647)
    @Column(name = "chart_of_account")
    private String chartOfAccount;
    @Size(max = 2147483647)
    @Column(name = "reference_no")
    private String referenceNo;
    @Size(max = 2147483647)
    @Column(name = "particulars")
    private String particulars;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Size(max = 2147483647)
    @Column(name = "entry_type")
    private String entryType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trans_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDate;
    @Column(name = "teller_code")
    private Integer tellerCode;
    @Column(name = "booktype")
    private Integer booktype;

    public CoopFinanceDailyTransactions() {
    }

    public CoopFinanceDailyTransactions(Integer transNo) {
        this.transNo = transNo;
    }

    public CoopFinanceDailyTransactions(Integer transNo, Date transDate) {
        this.transNo = transNo;
        this.transDate = transDate;
    }

    public Integer getTransNo() {
        return transNo;
    }

    public void setTransNo(Integer transNo) {
        this.transNo = transNo;
    }

    public String getChartOfAccount() {
        return chartOfAccount;
    }

    public void setChartOfAccount(String chartOfAccount) {
        this.chartOfAccount = chartOfAccount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Integer getTellerCode() {
        return tellerCode;
    }

    public void setTellerCode(Integer tellerCode) {
        this.tellerCode = tellerCode;
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transNo != null ? transNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoopFinanceDailyTransactions)) {
            return false;
        }
        CoopFinanceDailyTransactions other = (CoopFinanceDailyTransactions) object;
        if ((this.transNo == null && other.transNo != null) || (this.transNo != null && !this.transNo.equals(other.transNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CoopFinanceDailyTransactions[ transNo=" + transNo + " ]";
    }
    
}
