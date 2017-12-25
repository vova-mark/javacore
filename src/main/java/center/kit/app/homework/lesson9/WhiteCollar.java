package center.kit.app.homework.lesson9;

public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void setCompany(String company) {

        if (company.matches("[a-zA-Z\\s-,]+")) {
            this.company = company;
            System.out.println("Company name setted");
        } else {
            System.out.println("Invalid name of company");
        }
    }
}
