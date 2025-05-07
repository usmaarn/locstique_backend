package dev.usmaarn.locstique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();

    private String name;

    private String description;

    private Double price;

    private String image;

    private Double discount;

    private String details;

    private Integer stock;

    private String tag;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
