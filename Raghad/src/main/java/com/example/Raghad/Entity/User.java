//package com.example.Raghad.Entity;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.Collection;
//
//@Entity
//public class User implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    private String password;
//    private boolean enabled;
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        // Return the user's authorities (roles, permissions, etc.)
//        // You can customize this implementation based on your application's needs
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true; // You can customize this based on your application's needs
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true; // You can customize this based on your application's needs
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true; // You can customize this based on your application's needs
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return enabled;
//    }
//}
