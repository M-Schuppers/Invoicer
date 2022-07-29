package org.invoicer.controller;

import lombok.extern.slf4j.Slf4j;
import org.invoicer.model.Business;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
class BusinessControllerTest {

    //Testdata
    BusinessController b = new BusinessController();

    @Test
    public void testAddNewCompany() {
        //given
        final int ID = 1;
        final String companyName = "Testy Company";
        final String bAddress = "Cederlane";
        final String bHousenumber = "25 a";
        final String bPostalcode = "2000 AA";
        final String bEmailaddress = "TestyCompany@Contact.tst";
        final String bPhonenumber = "0600000000";

        //when
        final var result = b.addNewBusiness(ID, companyName, bAddress,
                bHousenumber, bPostalcode, bPhonenumber, bEmailaddress);

        final var expectedResult = Business.builder().id(ID).companyName(companyName).bAddress(bAddress)
                .bHousenumber(bHousenumber).bPostalcode(bPostalcode)
                .bEmailaddress(bEmailaddress).bPhoneNumber(bPhonenumber).build();


        //then
        assertThat(result.getId()).isEqualTo(expectedResult.getId());
        assertThat(result.getCompanyName()).isEqualTo(expectedResult.getCompanyName());
        assertThat(result.getBAddress()).isEqualTo(expectedResult.getBAddress());
        assertThat(result.getBHousenumber()).isEqualTo(expectedResult.getBHousenumber());
        assertThat(result.getBPostalcode()).isEqualTo(expectedResult.getBPostalcode());
        assertThat(result.getBPhoneNumber()).isEqualTo(expectedResult.getBPhoneNumber());
        assertThat(result.getBEmailaddress()).isEqualTo(expectedResult.getBEmailaddress());
        log.info("ID present in result: "+result.getId()+" and expected: "+ expectedResult.getId());
        log.info("Company-name present in result: "+ result.getCompanyName()+" and expected: " + expectedResult.getCompanyName());
        log.info("Address presented in result: " + result.getBAddress() + " and expected: " + expectedResult.getBAddress());
        log.info("House-number presented in result: " + result.getBHousenumber() + " and expected: " + expectedResult.getBHousenumber());
        log.info("ZipCode presented in result: " + result.getBPostalcode() + " and expected: " + expectedResult.getBPostalcode());
        log.info("Phone number presented in result: " + result.getBPhoneNumber() + " and expected: " + expectedResult.getBPhoneNumber());
        log.info("Email-address presented in result: " + result.getBEmailaddress() + " and expected: " + expectedResult.getBEmailaddress());

    }
}