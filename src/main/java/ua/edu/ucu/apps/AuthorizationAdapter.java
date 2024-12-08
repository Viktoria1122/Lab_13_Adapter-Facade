package ua.edu.ucu.apps;

public class AuthorizationAdapter {
    private final Авторизація авторизація;

    public AuthorizationAdapter(Авторизація авторизація) {
        this.авторизація = авторизація;
    }

    public boolean authorize(DatabaseAdapter database) {
        return авторизація.авторизуватися(database.getБазаДаних());
    }
}
