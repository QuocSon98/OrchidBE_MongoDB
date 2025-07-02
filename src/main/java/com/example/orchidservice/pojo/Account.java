package com.example.orchidservice.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "accounts")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String accountId;

    private String accountName;

    private String email;

    private String password;

    @DBRef
    private Role role;
    @DBRef
    private List<Order> orders;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", email='" + email + '\'' +
                // Don't include role in toString to avoid lazy loading
                '}';
    }
}
