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

        final var expectedResult = new Business(ID,companyName,bAddress,bHousenumber,bPostalcode,bEmailaddress, bPhonenumber);


        //then
        assertThat(result.getId()).isEqualTo(expectedResult.getId());
        assertThat(result.getCompanyName()).isEqualTo(expectedResult.getCompanyName());
        assertThat(result.getBAddress()).isEqualTo(expectedResult.getBAddress());
        assertThat(result.getBHousenumber()).isEqualTo(expectedResult.getBHousenumber());
        assertThat(result.getBPostalcode()).isEqualTo(expectedResult.getBPostalcode());
        assertThat(result.getBPhoneNumber()).isEqualTo(expectedResult.getBPhoneNumber());
        assertThat(result.getBEmailaddress()).isEqualTo(expectedResult.getBEmailaddress());
        log.info("ID presented in result: " +String.valueOf(result.getBAddress())+ " and expected: " + expectedResult.getBAddress());
        log.info("ID presented in result: " +String.valueOf(result.getBHousenumber())+ " and expected: " + expectedResult.getBHousenumber());
        log.info("ID presented in result: " +String.valueOf(result.getBPostalcode())+ " and expected: " + expectedResult.getBPostalcode());
        log.info("ID presented in result: " +String.valueOf(result.getBPhoneNumber())+ " and expected: " + expectedResult.getBPhoneNumber());
        log.info("ID presented in result: " +String.valueOf(result.getBEmailaddress())+ " and expected: " + expectedResult.getBEmailaddress());

    }
}