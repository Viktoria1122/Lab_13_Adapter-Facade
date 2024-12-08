package ua.edu.ucu.apps;

import java.time.LocalDateTime;
import ua.edu.ucu.apps.AuthMethod;


public class Main {
    public static void main(String[] args) {
        try {
            // Authenticate the user
            AuthMethod authMethod = AuthMethod.FACEBOOK;
            User user = authenticateUser(authMethod);

            if (user != null) {
                System.out.println("Authenticated user: "
                        + user.getUserMail()
                        + ", Country: " + user.getCountry()
                        + ", Last Active: " + user.getLastActiveTime());
            } else {
                System.err.println("Authentication failed for method: " + authMethod);
            }

            // Fetch company details
            Company company = fetchCompanyDetails("Example Company");
                        if (company != null) {
                            System.out.println("Company Details: " + company);
                        }
                    } catch (Exception e) {
                        System.err.println("Unexpected error: " + e.getMessage());
                    }
                }
            
                private static Company fetchCompanyDetails(String string) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'fetchCompanyDetails'");
                }
            
                /**
     * Authenticate a user based on the given authentication method.
     *
     * @param authMethod Authentication method to use.
     * @return Authenticated User or null if authentication fails.
     */
    private static User authenticateUser(AuthMethod authMethod) {
        if (authMethod == null) {
            System.err.println("No authentication method provided.");
            return null;
        }

        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser(
                        "user@example.com", "USA", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser(
                        "user@twitter.com", "UK", LocalDateTime.now().minusDays(1).toString());
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                System.err.println("Unsupported authentication method: " + authMethod);
                break;
        }
        return user;
    }
}
