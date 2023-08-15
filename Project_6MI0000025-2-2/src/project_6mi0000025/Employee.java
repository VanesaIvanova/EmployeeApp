package project_6mi0000025;

abstract class Employee implements Payable{
    private String name;
    private String surname;
    private double expiriance;
    private String position;

    public Employee(String name, String surname, double expririance, String position){
        this.name = name;
        this.surname = surname;
        this.expiriance = expiriance;
        this.position = position;
    }

    public Employee(RegularStaff other) {}

    public Employee(){}

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }
    String getSurname(){
        return surname;
    }

    void setExpiriance(double expiriance){
        this.expiriance = expiriance;
    }
    double getExpiriance(){
        return expiriance;
    }

    void setPosition(String position){
        this.position = position;
    }
    String getPosition(){
        return position;
    }
    public String toString(){
        String result = "Employee "+name+surname+" worked for "+expiriance+" as a "+position;
        return result;
    }
}
