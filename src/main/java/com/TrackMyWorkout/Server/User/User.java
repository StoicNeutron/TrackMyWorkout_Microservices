package com.TrackMyWorkout.Server.User;

import jakarta.persistence.*;

@Entity(name ="users")
public class User{

    @Id
    @SequenceGenerator(name = "User_sequence", sequenceName = "User_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_sequence")
    @Column(name = "id")
    private Integer id;
    @Column(name = "userName", nullable = false, columnDefinition = "TEXT")
    private String userName;
    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String passWord;
    @Column(name = "salt", nullable = false, columnDefinition = "TEXT")
    private String salt;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name = "verified", nullable = false, columnDefinition = "BOOLEAN")
    private boolean verified;

    public User() {
        this.userName = null;
        this.passWord = null;
        this.salt = null;
        this.email = null;
        this.verified = false;
    }

    public User(String userName, String password, String salt, String email){
        this.userName = userName;
        this.passWord = password;
        this.salt = salt;
        this.email = email;
    }
}
