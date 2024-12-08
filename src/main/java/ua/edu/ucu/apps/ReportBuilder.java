package ua.edu.ucu.apps;

public class ReportBuilder {
    public void buildReport(AuthorizationAdapter authorization, DatabaseAdapter database) {
        if (authorization.authorize(database)) {
            System.out.println("Report is being built.");
        } else {
            System.out.println("Authorization failed. Cannot build the report.");
        }
    }
}
