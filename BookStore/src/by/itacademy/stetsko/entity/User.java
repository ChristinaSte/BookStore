package by.itacademy.stetsko.entity;

public class User {


    private String email;
    private String password;

    public User() {
    }


    public User(String inEmail, String inPassword) {
        email = inEmail;
        password = inPassword;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String inEmail) {
        email = inEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String inPassword) {
        password = inPassword;
    }
}
