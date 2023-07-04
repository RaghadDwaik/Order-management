//package com.example.Raghad.Controller;
//
//import com.example.Raghad.Entity.SignupRequest;
//import com.example.Raghad.Entity.User;
//import com.example.Raghad.Service.UserService;
//import com.example.Raghad.Service.UserServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/signup")
//public class UserController {
//
//    private UserService userService;
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserController(UserService userService, PasswordEncoder passwordEncoder) {
//        this.userService = userService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> signup(@RequestBody SignupRequest signupRequest) {
//        try {
//            // Validate the input data
//            if (StringUtils.isEmpty(signupRequest.getUsername()) || StringUtils.isEmpty(signupRequest.getPassword())) {
//                return ResponseEntity.badRequest().body("Username and password are required.");
//            }
//
//            // Check if the username is already taken
//            if (UserServices.existsByUsername(signupRequest.getUsername())) {
//                return ResponseEntity.badRequest().body("Username is already taken.");
//            }
//
//            // Create a new User entity
//            User user = new User();
//            user.setUsername(signupRequest.getUsername());
//            // Encrypt the password using the password encoder
//            String encodedPassword = passwordEncoder.encode(signupRequest.getPassword());
//            user.setPassword(encodedPassword);
//
//            // Save the user entity in the database using the UserService instance
//            UserServices.saveUser(user);
//
//            return ResponseEntity.ok("User registered successfully.");
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during signup.");
//        }
//    }
//}
