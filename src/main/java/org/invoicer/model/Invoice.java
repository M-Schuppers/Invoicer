package org.invoicer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Invoice {
    int id;
    private int customerid;
    private String customerName;
    private int businessid;
    private String businessName;
    private int productid;
    private String cAdress;
    private String bAdress;
    private String footText;
    private String descriptionText;

}
