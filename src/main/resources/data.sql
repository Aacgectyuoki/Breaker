-- Insert users
INSERT INTO user (id, username, password, email) VALUES
(1, 'admin', '$2a$10$8hOY1lpT6OqvC.3p1l9X9uONvLJ1yD1fY/NPL8pZKYdRkZa8yfhAa', 'admin@example.com'), -- password: admin123
(2, 'user1', '$2a$10$WpOh67Hc4eH4/1Rc3FO3deJ8KQLF3Y06Dk2NXYGxq8SKsfvD4QwUm', 'user1@example.com'), -- password: user123
(3, 'user2', '$2a$10$Pl5rSHgKZxYJbctGjYPzxu/Z04RlHgN53U2.P6TgygCNM5cS.aOsu', 'user2@example.com'); -- password: user123

-- Insert tasks
INSERT INTO task (id, title, description, priority, status, user_id) VALUES
(1, 'Develop Backend', 'Develop the backend for the Breaker application', 'HIGH', 'OPEN', 1),
(2, 'Design Frontend', 'Design the frontend for the Breaker application', 'MEDIUM', 'OPEN', 2),
(3, 'Deploy Application', 'Deploy the application to the production environment', 'LOW', 'OPEN', 3);

-- Insert subtasks
INSERT INTO subtask (id, title, status, task_id) VALUES
(1, 'Set up Spring Boot project', 'COMPLETED', 1),
(2, 'Create entities', 'IN_PROGRESS', 1),
(3, 'Create REST APIs', 'PENDING', 1),
(4, 'Design UI components', 'COMPLETED', 2),
(5, 'Integrate with backend', 'PENDING', 2),
(6, 'Configure CI/CD pipeline', 'IN_PROGRESS', 3),
(7, 'Deploy to AWS', 'PENDING', 3);
