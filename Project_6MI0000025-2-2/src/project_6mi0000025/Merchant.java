package project_6mi0000025;

class Merchant extends Employee{
    private double sales = 0.0;
    private double pay = 0.0;
    
    public Merchant(String name, String surname, int expiriance, String position, double sales, double pay){
        super(name, surname, expiriance, position);
        this.sales = sales;
        this.pay = pay;
    }

    public Merchant(Merchant other) {}

    public Merchant() {}
    
    void setSalary(double sales){
        this.sales = sales;
    }
    double getSalary(){
        pay();
        return sales;
    }
    @Override
    public double pay() {
        pay = 0.15*sales;
        return pay;
    }
    void setSales(double sales){
       this.sales = sales;
    }
    double getSales(){
        return sales;
    }
    public String toString(){
        String result = "Employee "+super.getName()+" "+super.getSurname()+" worked for "+super.getExpiriance()+" years as a "+super.getPosition() +", his/her salary now is "+pay;
        return result;
    }
}