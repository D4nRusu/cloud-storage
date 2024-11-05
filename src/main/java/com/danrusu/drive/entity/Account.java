package com.danrusu.drive.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account", schema = "public")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;

    private String email;

    @JsonIgnore
    private String salt;

    @JsonIgnore
    private String passhash;

    public Account(){
    }

    public Account(String email, String salt, String passhash){
        this.email = email;
        this.salt = salt;
        this.passhash = passhash;
    }

}
