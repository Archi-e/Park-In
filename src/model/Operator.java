package model;

public class Operator extends BaseModel{
    private String name;
    private String contactNo;

    public Operator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                '}';
    }
}
