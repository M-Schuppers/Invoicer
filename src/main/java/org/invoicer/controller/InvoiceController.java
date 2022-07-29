package org.invoicer.controller;

import org.invoicer.model.Business;
import org.invoicer.model.Customer;
import org.invoicer.model.Invoice;

public class InvoiceController {
    public Invoice addNewInvoice(Customer c, Business b) {
        return Invoice.builder()
                .id(5)
                .customerName(c.getFirstName()+" "+c.getLastName())
                .customerid(c.getId())
                .businessid(b.getId())
                .businessName(b.getCompanyName())
                //   .productid(p.getId())
                .cAdress(c.getAddress())
                .bAdress(b.getBAddress())
                .footText("Default footer text")
                .descriptionText("Default description text").build();


    }
}
