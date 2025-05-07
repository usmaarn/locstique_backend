package dev.usmaarn.locstique.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Min(1)
    @NotNull
    private Double price;

    @NotBlank
    @URL
    private String image;

    private Double discount;

    @NotBlank
    private String details;

    private Integer stock;

    private String tag;
}
