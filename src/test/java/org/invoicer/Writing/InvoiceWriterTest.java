package org.invoicer.Writing;

import org.invoicer.controller.InvoiceController;
import org.invoicer.model.Business;
import org.invoicer.model.Customer;
import org.invoicer.model.Invoice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InvoiceWriterTest {

    final InvoiceWriter fw = new InvoiceWriter();
    final InvoiceController ic = new InvoiceController();


    @Test
    void createTestNewFile() {

        //given
        //Business data
        final int ID = 1;
        final String companyName = "Testy Company";
        final String bAddress = "Cederlane";
        final String bHousenumber = "25 a";
        final String bPostalcode = "2000 AA";
        final String bEmailaddress = "TestyCompany@Contact.tst";
        final String bPhonenumber = "0600000000";

        //Customer Data
        final int id = 1;
        final String firstName = "John";
        final String lastName = "Smith";
        final String insertion = "the";
        final String adress = "Workerlane";
        final int housenumber = 24;
        final String zipcode = "0000ZZ";
        final String emailaddress = "JohnTheSmith@SmithCo.com";
        final String phonenumber = "0600000000";
        final boolean isBusinessRelation = true;

        final var c = Customer.builder().id(id)
                .firstName(firstName).lastName(lastName).insertion(insertion)
                .address(adress).housenumber(housenumber).zipcode(zipcode)
                .emailaddress(emailaddress).phonenumber(phonenumber).isBusinessRelation(isBusinessRelation).build();

        final var b = Business.builder().id(ID).companyName(companyName).bAddress(bAddress)
                .bHousenumber(bHousenumber).bPostalcode(bPostalcode)
                .bEmailaddress(bEmailaddress).bPhoneNumber(bPhonenumber).build();


        Invoice i = ic.addNewInvoice(c, b);
        //when
        assertThat(fw.createNewFile(i)).isTrue();

        //then

    }
}