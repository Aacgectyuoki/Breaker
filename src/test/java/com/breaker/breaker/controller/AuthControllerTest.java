//package com.breaker.breaker.controller;
//
//import com.breaker.breaker.dto.AuthResponse;
//import com.breaker.breaker.entity.User;
//import com.breaker.breaker.service.UserService;
//import com.breaker.breaker.util.JwtUtils;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(AuthController.class)
//class AuthControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private UserService userService;
//
//    @MockBean
//    private JwtUtils jwtUtils;
//
//    @Test
//    void testLogin() throws Exception {
//        // Arrange
//        User user = new User();
//        user.setUsername("testuser");
//        user.setPassword("password");
//
//        AuthResponse authResponse = new AuthResponse("fake-jwt-token", "testuser", "testuser@example.com", "USER");
//
//        when(userService.authenticateUser(any(String.class), any(String.class))).thenReturn(user);
//        when(jwtUtils.generateToken(any(User.class))).thenReturn("fake-jwt-token");
//
//        // Act & Assert
//        mockMvc.perform(post("/api/auth/login")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"username\":\"testuser\", \"password\":\"password\"}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.token").value("fake-jwt-token"))
//                .andExpect(jsonPath("$.username").value("testuser"));
//    }
//}
