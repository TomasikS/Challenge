/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfers;

/**
 *
 * @author HP
 */
public abstract class Transfer {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getDebit() {
        return debit;
    }

    public void setDebit(Boolean debit) {
        this.debit = debit;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    private int id;
    private String accounttype;
    private String currency;
    private String date;
    private String description;
    private Double amount;
    private Boolean debit;
    private String label;

    public Transfer(int id, String accounttype, String currency, String date, String description, Double amount, Boolean debit, String label) {
        this.id = id;
        this.accounttype = accounttype;
        this.currency = currency;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.debit = debit;
        this.label = label;
    }

}
