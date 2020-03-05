package org.ecuadorjug.reactive.domain;

import lombok.Data;

@Data
public class Payroll {

    private Integer id;
    private String fromAccountNumber;
    private String fromAccountType;
    private String toAccountNumber;
    private String toAccountType;
    private String currency;
    private Double ammount;
    private String description;
}
