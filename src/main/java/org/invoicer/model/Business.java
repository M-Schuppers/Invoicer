package org.invoicer.model;

import lombok.*;

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
    private enum bCountry{NETHERLANDS, BELGIUM, GERMANY};


}
