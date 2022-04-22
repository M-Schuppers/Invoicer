package org.invoicer.controller;

import org.invoicer.model.Business;

public class BusinessController {

    public Business addNewBusiness(int id, String companyName, String address,
                            String housenumber, String postalcode, String phonenumber, String emailaddress){
        return Business.builder()
                .id(id)
                .companyName(companyName)
                .bAddress(address)
                .bHousenumber(housenumber)
                .bPostalcode(postalcode)
                .bPhoneNumber(phonenumber)
                .bEmailaddress(emailaddress)
                .build();
    }

}
