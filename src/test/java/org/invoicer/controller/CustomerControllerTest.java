package org.invoicer.controller;

import lombok.extern.slf4j.Slf4j;
import org.invoicer.model.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class CustomerControllerTest {

    CustomerController c = new CustomerController();
    @Test
    void addNewCustomer() {

        //given
        final int id = 1;
        final String firstName = "John";
        final String lastName= "Smith" ;
        final String insertion= "the";
        final String adress = "Workerlane";
        final int housenumber= 24;
        final String zipcode= "0000ZZ";
        final String emailaddress = "JohnTheSmith@SmithCo.com";
        final String phonenumber = "0600000000";
        final boolean isBusinessRelation =  true;


        //when
        final var result = c.addNewCustomer(id,firstName,lastName,insertion,adress,housenumber,zipcode,emailaddress,phonenumber,isBusinessRelation);

        final var expectedResult = Customer.builder().id(id)
                .firstName(firstName).lastName(lastName).insertion(insertion)
                .address(adress).housenumber(housenumber).zipcode(zipcode)
                .emailaddress(emailaddress).phonenumber(phonenumber).isBusinessRelation(isBusinessRelation).build();

        //then
        assertThat(result.getId()).isEqualTo(expectedResult.getId());
        assertThat(result.getFirstName()).isEqualTo(expectedResult.getFirstName());
        assertThat(result.getLastName()).isEqualTo(expectedResult.getLastName());
        assertThat(result.getAddress()).isEqualTo(expectedResult.getAddress());
        assertThat(result.getHousenumber()).isEqualTo(expectedResult.getHousenumber());
        assertThat(result.getEmailaddress()).isEqualTo(expectedResult.getEmailaddress());

        log.info("Assertions completed succesfully");
    }
}