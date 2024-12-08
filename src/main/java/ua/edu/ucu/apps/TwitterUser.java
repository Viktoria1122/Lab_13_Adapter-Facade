package ua.edu.ucu.apps;

import lombok.ToString;

@ToString
public class TwitterUser {

    private String userMail;
    private String country;
    private String lastActiveTime;

    public TwitterUser(String userMail, String country, String lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public String getLastActiveTime() {
        return lastActiveTime;
    }
}
