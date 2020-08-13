/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.DoubleStream;
import transfers.BankCharges;
import transfers.Cash;
import transfers.CreditCard;
import transfers.Grocery;
import transfers.InterestCharges;
import transfers.InterestIncome;
import transfers.Mobile;
import transfers.Salary;
import transfers.Saving;
import transfers.Transfers;

/**
 *
 * @author Tomasik
 */
public class Main {

    private static List<Mobile> mobiles = new ArrayList();
    private static List<Cash> cashes = new ArrayList();
    private static List<CreditCard> cards = new ArrayList();
    private static List<InterestIncome> interests = new ArrayList();
    private static List<Grocery> groceries = new ArrayList();
    private static List<BankCharges> charges = new ArrayList();
    private static List<Salary> salaries = new ArrayList();
    private static List<Saving> savings = new ArrayList();
    private static List<InterestCharges> interestCharges = new ArrayList();
    private static List<Transfers> transfers = new ArrayList();
    private static List<List<String>> records = new ArrayList<>();

    public static List<List<String>> readData() throws IOException {
        List<List<String>> data = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Stefan\\bank_transactions_sample.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        while ((line = br.readLine()) != null) {
            String COMMA_DELIMITER = ",";
            String[] values = line.split(COMMA_DELIMITER);
            data.add(Arrays.asList(values));

        }

        return data;
    }

    public static List parseMobiles() {

        try {
            records = readData();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return mobiles;
    }

    public static List parseCashes() {

        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);

        return cashes;

    }

    public static List parseCreditCards() {

        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return cards;
    }

    public static List parseInterestIncome() {

        try {
            records = readData();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return interests;
    }

    public static List parseGroceries() {
        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return groceries;

    }

    public static List parseBankCharges() {
        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return charges;

    }

    public static List parseSalary() {

        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return salaries;

    }

    public static List parseSaving() {
        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return savings;

    }

    public static List parseInterestCharges() {

        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        startLoopFor(records);
        return interestCharges;
    }

    public static List parseTransfers() {

        try {
            records = readData();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        startLoopFor(records);
        return transfers;
    }

    public static void startLoopFor(List<List<String>> records) {

        for (int i = 0; i < records.size(); i++) {

            if (records.get(i).get(7).equals("Transfers")) {
                Transfers transfer = new Transfers(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                transfers.add(transfer);

            }

            if (records.get(i).get(7).equals("Interest charges")) {
                InterestCharges InterestCharge = new InterestCharges(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                interestCharges.add(InterestCharge);

            }

            if (records.get(i).get(7).equals("Saving (general)")) {
                Saving saving = new Saving(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                savings.add(saving);
            }

            if (records.get(i).get(7).equals("Salary or Wages (Main)")) {
                Salary salary = new Salary(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                salaries.add(salary);

            }

            if (records.get(i).get(7).equals("Bank charges")) {
                BankCharges Bankcharges = new BankCharges(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );
                charges.add(Bankcharges);
            }

            if (records.get(i).get(7).startsWith("\"")) {
                Grocery grocery = new Grocery(Integer.parseInt(records.get(i).get(0).substring(1, records.get(i).get(0).length() - 1)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                groceries.add(grocery);
            }

            if (records.get(i).get(7).equals("Interest income")) {
                InterestIncome interest = new InterestIncome(Integer.parseInt(records.get(i).get(0)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                interests.add(interest);

            }

            if (records.get(i).get(7).equals("Credit Card")) {
                CreditCard card = new CreditCard(Integer.parseInt(records.get(i).get(0)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                cards.add(card);

            }

            if (records.get(i).get(7).equals("Cash")) {
                Cash cash = new Cash(Integer.parseInt(records.get(i).get(0)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                cashes.add(cash);

            }

            if (records.get(i).get(7).equals("Mobile")) {
                Mobile mobile = new Mobile(Integer.parseInt(records.get(i).get(0)),
                        records.get(i).get(1), records.get(i).get(2), records.get(i).get(3),
                        records.get(i).get(4), Double.parseDouble(records.get(i).get(5)),
                        Boolean.parseBoolean(records.get(i).get(6)), records.get(i).get(7)
                );

                mobiles.add(mobile);

            }

        }
    }

    public static void main(String[] args) {
        mobiles = parseMobiles();
        cashes = parseCashes();
        cards = parseCreditCards();
        interests = parseInterestIncome();
        groceries = parseGroceries();
        charges = parseBankCharges();
        salaries = parseSalary();
        savings = parseSaving();
        interestCharges = parseInterestCharges();
        transfers = parseTransfers();
        DoubleStream SumMobiles = mobiles.stream().mapToDouble(mobiles -> mobiles.getAmount());
        DoubleStream SumCashes = cashes.stream().mapToDouble(cashes -> cashes.getAmount());
        DoubleStream SumCards = cards.stream().mapToDouble(cards -> cards.getAmount());
        DoubleStream SumInterests = interests.stream().mapToDouble(interests -> interests.getAmount());
        DoubleStream SumGroceries = groceries.stream().mapToDouble(groceries -> groceries.getAmount());
        DoubleStream SumCharges = charges.stream().mapToDouble(charges -> charges.getAmount());
        DoubleStream SumSalaries = salaries.stream().mapToDouble(salaries -> salaries.getAmount());
        DoubleStream SumSavings = savings.stream().mapToDouble(savings -> savings.getAmount());
        DoubleStream SumInterestCharges = interestCharges.stream().mapToDouble(interestCharges -> interestCharges.getAmount());
        DoubleStream SumTransfers = transfers.stream().mapToDouble(transfers -> transfers.getAmount());
        System.out.println("mobiles " + mobiles.size() + " items |  " + "total amount " + SumMobiles.sum() + "EUR");
        System.out.println("cashes " + cashes.size() + " items |  " + "total amount " + SumCashes.sum() + "EUR");
        System.out.println("credit cards " + cards.size() + " items |  " + "total amount " + SumCards.sum() + "EUR");
        System.out.println("interests incomes " + interests.size() + " items |  " + "total amount " + SumInterests.sum() + "EUR");
        System.out.println("groceries " + groceries.size() + " items |  " + "total amount " + SumGroceries.sum() + "EUR");
        System.out.println("transfers " + charges.size() + " items |  " + "total amount " + SumCharges.sum() + "EUR");
        System.out.println("salaries " + salaries.size() + " items |  " + "total amount " + SumSalaries.sum() + "EUR");
        System.out.println("savings " + savings.size() + " items |  " + "total amount " + SumSavings.sum() + "EUR");
        System.out.println("interest charges " + interestCharges.size() + " items |  " + "total amount " + SumInterestCharges.sum() + "EUR");
        System.out.println("transfers " + transfers.size() + " items |  " + "total amount " + SumTransfers.sum() + "EUR");
    }

}
