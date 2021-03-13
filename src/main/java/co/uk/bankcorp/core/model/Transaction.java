package co.uk.bankcorp.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private String accountId;
    private String type;
    private String currency;
    private Long exchangeRate;
    private Long amount;
    private String merchantName;
    private String merchantCategoryCode;
    private Date date;
}
