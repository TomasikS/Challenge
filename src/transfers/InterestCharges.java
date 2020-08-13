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
public class InterestCharges extends Transfer {

    public InterestCharges(int id, String accounttype, String currency, String date, String description, Double amount, Boolean debit, String label) {
        super(id, accounttype, currency, date, description, amount, debit, label);
    }

}
