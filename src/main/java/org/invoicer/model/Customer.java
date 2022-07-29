package org.invoicer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String insertion;
    private String address;
    private int housenumber;
    private String zipcode;
    private enum country{NETHERLANDS, BELGIUM, GERMANY};
    private String emailaddress;
    private String phonenumber;
    private boolean isBusinessRelation;



}
