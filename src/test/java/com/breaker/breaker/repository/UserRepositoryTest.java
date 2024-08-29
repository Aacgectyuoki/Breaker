//package com.breaker.breaker.repository;
//
//import com.breaker.breaker.entity.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//@ActiveProfiles("test") // Ensure you're using a test profile with an in-memory database
//class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    void testFindByUsername() {
//        // Arrange
//        User user = new User();
//        user.setUsername("testuser");
//        user.setPassword("password");
//        user.setEmail("testuser@example.com");
//        userRepository.save(user);
//
//        // Act
//        User foundUser = userRepository.findByUsername("testuser").orElse(null);
//
//        // Assert
//        assertThat(foundUser).isNotNull();
//        assertThat(foundUser.getUsername()).isEqualTo("testuser");
//    }
//}
