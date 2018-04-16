package com.polaris.inventory.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier", schema = "polariserp")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "ADDRESSLINE1")
    private String addressLine1;
    @Column(name = "ADDRESSLINE2")
    private String addressLine2;
    @Column(name = "ADDRESSLINE3")
    private String addressLine3;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "POSTCODE")
    private String postcode;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (id != supplier.id) return false;
        if (companyName != null ? !companyName.equals(supplier.companyName) : supplier.companyName != null)
            return false;
        if (firstName != null ? !firstName.equals(supplier.firstName) : supplier.firstName != null) return false;
        if (lastName != null ? !lastName.equals(supplier.lastName) : supplier.lastName != null) return false;
        if (phone != null ? !phone.equals(supplier.phone) : supplier.phone != null) return false;
        if (addressLine1 != null ? !addressLine1.equals(supplier.addressLine1) : supplier.addressLine1 != null)
            return false;
        if (addressLine2 != null ? !addressLine2.equals(supplier.addressLine2) : supplier.addressLine2 != null)
            return false;
        if (addressLine3 != null ? !addressLine3.equals(supplier.addressLine3) : supplier.addressLine3 != null)
            return false;
        if (city != null ? !city.equals(supplier.city) : supplier.city != null) return false;
        if (state != null ? !state.equals(supplier.state) : supplier.state != null) return false;
        if (country != null ? !country.equals(supplier.country) : supplier.country != null) return false;
        if (postcode != null ? !postcode.equals(supplier.postcode) : supplier.postcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (addressLine3 != null ? addressLine3.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        return result;
    }
}
