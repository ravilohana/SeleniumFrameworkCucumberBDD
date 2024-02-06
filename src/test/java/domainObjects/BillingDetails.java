package domainObjects;

public class BillingDetails {


    private String billingFirstName;
    private String billingLastName;
    private String billingCompanyName;
    private String billingCountryName;
    private String billingAddress1;
    private String billingAddress2;

    private String billingCity;
    private String billingStateName;
    private String billingZip;
    private String billingPhoneNo;
    private String billingEmail;


    public BillingDetails(String billingFirstName, String billingLastName,
                          String billingCompanyName, String billingCountryName,
                          String billingAddress1, String billingAddress2,
                          String billingCity, String billingStateName,
                          String billingPhoneNo,
                          String billingZip,
                          String billingEmail) {
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billingCompanyName = billingCompanyName;
        this.billingCountryName = billingCountryName;
        this.billingAddress1 = billingAddress1;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingStateName = billingStateName;
        this.billingZip = billingZip;
        this.billingPhoneNo = billingPhoneNo;
        this.billingEmail = billingEmail;
    }

    // getter and Setter


    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String billingCompanyName) {
        this.billingCompanyName = billingCompanyName;
    }

    public String getBillingCountryName() {
        return billingCountryName;
    }

    public void setBillingCountryName(String billingCountryName) {
        this.billingCountryName = billingCountryName;
    }

    public String getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    public String getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateName() {
        return billingStateName;
    }

    public void setBillingStateName(String billingStateName) {
        this.billingStateName = billingStateName;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingPhoneNo() {
        return billingPhoneNo;
    }

    public void setBillingPhoneNo(String billingPhoneNo) {
        this.billingPhoneNo = billingPhoneNo;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }
}