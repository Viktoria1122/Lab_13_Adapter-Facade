package ua.edu.ucu.apps;

public class FacebookUser {

    private String email;
    private String userCountry;
    private String userActiveTime;

    public FacebookUser(String email, String userCountry, String userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserActiveTime() {
        return userActiveTime;
    }
}
