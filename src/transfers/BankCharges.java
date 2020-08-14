/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfers;

import java.util.Date;

/**
 *
 * @author Tomasik
 */
public class BankCharges extends Transfer {

    public BankCharges(int id, String accounttype, String currency, Date date, String description, Double amount, Boolean debit, String label) {
        super(id, accounttype, currency, date, description, amount, debit, label);
    }

}
