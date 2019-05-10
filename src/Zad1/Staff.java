package Zad1;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                "addres=" + getAddress() +
                "school=" + school +
                ", pay=" + pay +
                '}';
    }
}
