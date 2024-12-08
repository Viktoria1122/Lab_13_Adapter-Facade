package ua.edu.ucu.apps;

public class FacebookUserAdapter implements User{

    private FacebookUser facebookUser;

    public FacebookUserAdapter( FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }
 
    @Override

    public String getUserMail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }

    @Override
    public String toString() {
        return "Emai:" + getUserMail() + ", ";
        // + "Country"
    }


}
