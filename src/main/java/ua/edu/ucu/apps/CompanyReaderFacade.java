package ua.edu.ucu.apps;

import java.io.IOException;
import java.net.URISyntaxException;

public class CompanyReaderFacade {

    private final PDLReader pdlReader;
    private final BrandFetchReader brandFetchReader;

    public CompanyReaderFacade() {
        this.pdlReader = new PDLReader();
        this.brandFetchReader = new BrandFetchReader();
    }

    public Company fetch(String companyName) throws IOException, InterruptedException, URISyntaxException {
        Company companyBF = null;
        Company companyPDL = null;

        try {
            companyBF = brandFetchReader.fetch(companyName);
        } catch (Exception e) {
            System.err.println("Failed to fetch from BrandFetchReader: " + e.getMessage());
        }

        try {
            companyPDL = pdlReader.fetch(companyName);
        } catch (Exception e) {
            System.err.println("Failed to fetch from PDLReader: " + e.getMessage());
        }

        if (companyBF == null && companyPDL == null) {
            throw new IOException("Failed to fetch company data from both sources.");
        }

        return mergeCompanies(companyBF, companyPDL);
    }

    private Company mergeCompanies(Company companyBF, Company companyPDL) {
        if (companyBF == null) {
            return companyPDL;
        }
        if (companyPDL == null) {
            return companyBF;
        }

        Company mergedCompany = new Company();
        mergedCompany.setName(companyBF.getName() != null ? companyBF.getName() : companyPDL.getName());
        mergedCompany.setDescription(companyBF.getDescription() != null ? companyBF.getDescription() : companyPDL.getDescription());
        mergedCompany.setWebsite(companyBF.getWebsite() != null ? companyBF.getWebsite() : companyPDL.getWebsite());

        return mergedCompany;
    }

    public Company readCompany(String companyName) throws IOException, InterruptedException, URISyntaxException {
        System.out.println("Fetching data for company: " + companyName);
        return fetch(companyName);
    }
}
