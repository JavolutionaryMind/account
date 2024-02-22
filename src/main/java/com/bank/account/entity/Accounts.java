package com.bank.account.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customerId;
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
