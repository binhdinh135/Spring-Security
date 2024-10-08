package com.example.securitysession8.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="account_transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransactions {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private int transactionAmt;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "create_dt")
    private String createDt;

}