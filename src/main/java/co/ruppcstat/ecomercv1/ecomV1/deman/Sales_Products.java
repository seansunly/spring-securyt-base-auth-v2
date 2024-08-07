package co.ruppcstat.ecomercv1.ecomV1.deman;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Sales_Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer saleDetailId;
    private Float quantity;
    private Float unitPrice;
    private Float amount;
    private Boolean isDeleted;
    //ProductID
    //SaleID
}
