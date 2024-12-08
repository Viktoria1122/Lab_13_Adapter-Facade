package ua.edu.ucu.apps;


public class TwitterUserAdapter implements User{

    private TwitterUser twitterUser;

    public TwitterUserAdapter( TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }
 
    @Override

    public String getUserMail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public String toString() {
        return twitterUser.toString();
    }

}
