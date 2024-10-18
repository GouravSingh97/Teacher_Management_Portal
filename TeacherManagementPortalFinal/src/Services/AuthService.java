package Services;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, String> users; // Store username and hashed password

    public AuthService() {
        users = new HashMap<>();
    }

    // Simulate user registration with hashed passwords
    public void register(String username, String password) {
        // In a real application, use a proper hashing function
        if (users.containsKey(username)) {
            throw new IllegalArgumentException("Username already exists.");
        }
        String hashedPassword = hashPassword(password);
        users.put(username, hashedPassword);
    }

    public boolean login(String username, String password) {
        String storedHashedPassword = users.get(username);
        return storedHashedPassword != null && verifyPassword(password, storedHashedPassword);
    }

    private String hashPassword(String password) {
        // Implement password hashing (e.g., BCrypt)
        return password; // Placeholder, replace with actual hashing
    }

    private boolean verifyPassword(String password, String hashedPassword) {
        // Implement password verification (e.g., BCrypt)
        return password.equals(hashedPassword); // Placeholder
    }
}
