package org.invoicer.controller;

import org.invoicer.model.Customer;

public class CustomerController {

    public Customer addNewCustomer(int id,
                                   String firstName, String lastName,
                                   String insertion,
                                   String address, int housenumber, String zipcode,
                                   String emailaddress, String phonenumber,
                                   boolean isBusinessRelation) {
        return Customer.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .insertion(insertion)
                .address(address)
                .housenumber(housenumber)
                .zipcode(zipcode)
                .emailaddress(emailaddress)
                .phonenumber(phonenumber)
                .isBusinessRelation(isBusinessRelation).build();
    }

}
