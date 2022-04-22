package org.invoicer.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private String articleNumber;
    private enum tax{NO_TAX,LOW,MEDIUM,HIGH}
    private double price;
}
