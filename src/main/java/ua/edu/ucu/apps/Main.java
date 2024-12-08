package ua.edu.ucu.apps;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = authenticateUser(authMethod);

        if (user != null) {
            System.out.println("Authenticated user: " 
                + user.getUserMail() 
                + ", Country: " + user.getCountry() 
                + ", Last Active: " + user.getLastActiveTime());
        }
    }

    private static User authenticateUser(AuthMethod authMethod) {
        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("user@example.com", "USA", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("user@twitter.com", "UK", LocalDateTime.now().minusDays(1).toString());
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                System.err.println("Unsupported authentication method: " + authMethod);
                break;
        }
        return user;
    }
}
