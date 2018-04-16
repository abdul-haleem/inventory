package com.polaris.inventory.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "business_transaction", schema = "polariserp")
public class BusinessTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TRANSACTIONDATE")
    private Date transactionDate;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "TRANSACTIONTIME")
    private Time transactionTime;

    public Long getId() {
        return id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Time getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Time transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessTransaction that = (BusinessTransaction) o;

        if (id != that.id) return false;
        if (transactionDate != null ? !transactionDate.equals(that.transactionDate) : that.transactionDate != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (transactionTime != null ? !transactionTime.equals(that.transactionTime) : that.transactionTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (transactionDate != null ? transactionDate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (transactionTime != null ? transactionTime.hashCode() : 0);
        return result;
    }
}
