package org.invoicer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Business {
    private int id;
    private String companyName;
    private String bAddress;
    private String bHousenumber;
    private String bPostalcode;
    private String bEmailaddress;
    private String bPhoneNumber;

    private enum bCountry {NETHERLANDS, BELGIUM, GERMANY}

    ;


}
