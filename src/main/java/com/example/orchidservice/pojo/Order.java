package com.example.orchidservice.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.time.LocalDate;

@Document(collection = "orders")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;

    @DBRef
    private Account account;

    private LocalDate orderDate;

    private String orderStatus = "pending";

    private Double totalAmount;

    @DBRef
    private List<OrderDetail> orderDetails;

}
