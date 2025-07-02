package com.example.orchidservice.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orchids")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orchid {
    @Id
    private String orchidId;

    private Boolean isNatural = true;

    private String orchidDescription;

    private String orchidName;

    private String orchidUrl;

    private Double price;

    @DBRef
    private Category category;
    @DBRef
    private List<OrderDetail> orderDetails;
}
