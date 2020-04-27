/* balanithya created on 4/26/2020 inside the package - com.mytest.test.services */


package com.mytest.test.services;


import com.mytest.test.model.Customer;
import com.mytest.test.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PointsServiceMock {

    private static List<Transaction> transactions = new ArrayList<Transaction>();
    private static long receipt;

    static {

        transactions.add( new Transaction(receipt++, new Customer(1, "Siva"), 120.0, "PurchaseDetails 1", new Date()) );
        transactions.add( new Transaction(receipt++, new Customer(2, "Bala"), 80.0, "PurchaseDetails 2", new Date()) );
        transactions.add( new Transaction(receipt++, new Customer(3, "Nikitha"), 180.0, "PurchaseDetails 3", new Date()) );

    }


    public List<Transaction> getAll() {
        return transactions;
    }


}
