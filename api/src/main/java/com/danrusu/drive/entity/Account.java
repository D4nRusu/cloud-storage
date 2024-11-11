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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private long accountId;

    private String email;

    private String username;

    private String salt;
    
    private String passhash;

    public Account(){
    }

    public Account(String email, String passhash){
        this.email = email;
        this.salt = salt;
        this.passhash = passhash;
    }

    // DELETE LATER, USED FOR DEBUGGING
    public String toString(){
        return this.accountId + " " + this.email + " " + this.passhash;
    }

}
