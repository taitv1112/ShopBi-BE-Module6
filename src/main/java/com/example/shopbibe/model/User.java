package com.example.shopbibe.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;
    @NotBlank
    @Size(min = 3, max = 50)
    private String username;
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
        private String email;
    @JsonIgnore
    @NotBlank
    @Size(min = 6, max = 100)
    private String password;
    @Lob
    private String avatar;
    private String phone;
    private String address;
    private String nameStore;
    private double rateNumber;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<Role> roles = new HashSet<>();
    public User(  @NotBlank @Size(min = 3, max = 50)String name,
                  @NotBlank @Size(min = 3, max = 50)String username,
                  @NotBlank @Size(max = 50) @Email String email,
                  @NotBlank @Size(min = 6, max = 100)String encode,
                  String avatar) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = encode;
        this.avatar =avatar;
    }

    public User() {
    }
}
