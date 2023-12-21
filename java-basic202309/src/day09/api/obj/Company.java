package day09.api.obj;

import java.util.Objects;

public class Company {
    private String companyName;
    private String address;

    public Company(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) && Objects.equals(address, company.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, address);
    }
}
