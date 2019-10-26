package code._3_in_class;

import reactor.core.publisher.Mono;

public class User {
    public final String firstName;
    public final String lastName;
    public final String username;

    public User(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
