package com.bank.account.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long customerId;

    private String name;
    private String email;
    private String mobileNumber;
}
