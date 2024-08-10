package io.nakai.springvalidator.emtity;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String productId;
    private String productName;
    private String productDescription;
    private LocalDate expiredDay;
}
