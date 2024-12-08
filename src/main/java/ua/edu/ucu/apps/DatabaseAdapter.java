package ua.edu.ucu.apps;

public class DatabaseAdapter {
    private final БазаДаних базаДаних;

    public DatabaseAdapter(БазаДаних базаДаних) {
        this.базаДаних = базаДаних;
    }

    public БазаДаних getБазаДаних() {
        return базаДаних;
    }
}