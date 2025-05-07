package dev.usmaarn.locstique.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    private String id;

    private String transactionId;

    private String trackingNumber;

    private String customerId;

    private String totalAmount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
