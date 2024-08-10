package io.nakai.springvalidator.dto;

import io.nakai.springvalidator.anotation.FormatDatePattern;
import io.nakai.springvalidator.utils.DateUtils;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    @Min(value = 1, message = "1000")
    @Max(value = 256, message = "1000")
    @NotNull(message = "1000")
    @NotBlank( message = "1000")
    private String productName;

    @Min(value = 1, message = "1000")
    @Max(value = 40000, message = "1000")
    @NotNull(message = "1000")
    @NotBlank( message = "1000")
    private String productDescription;

    @NotNull(message = "1000")
    @NotBlank( message = "1000")
    @FormatDatePattern(pattern = DateUtils.YYYYMMDDDASH, message = "1000")
    private String expiredDay;
}
