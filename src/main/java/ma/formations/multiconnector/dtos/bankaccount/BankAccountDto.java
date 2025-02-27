package ma.formations.multiconnector.dtos.bankaccount;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.multiconnector.dtos.customer.CustomerDto;
import ma.formations.multiconnector.enums.AccountStatus;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccountDto {
    private Long id;
    private String rib;
    private Double amount;
    private String createdAt;
    private AccountStatus accountStatus;
    private CustomerDto customer;
}

