package org.ecuadorjug.reactive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
