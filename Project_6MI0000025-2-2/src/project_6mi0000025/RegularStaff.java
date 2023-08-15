package project_6mi0000025;

import java.text.DecimalFormat;

class RegularStaff extends Employee{
    private int hours = 0;
    private double salary = 0.0;

    public RegularStaff(String name, String surname, int expiriance, String position, int hours,double salary){
        super(name, surname, expiriance, position);
        this.hours = hours;
        this.salary =  salary;
    }
    public RegularStaff(Employee other){}

    public RegularStaff() {}
    
    void setHours(int hours){
        this.hours = hours;
    }
    int getHours(){
        return hours;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    public double pay(){
        int extraHours = 0;
        double exp = super.getExpiriance();
        salary = salary + salary*(exp*0.02);
        if (hours > 180){
            extraHours = hours - 180;
            salary = salary + salary*(extraHours*0.000625);
        }
        return salary;
    }
   
    public String toString(){
        DecimalFormat df1;
        df1 = new DecimalFormat("#.##");
        String result = "Employee "+super.getName()+" "+super.getSurname()+
                " worked for "+super.getExpiriance()+" years as a "+super.getPosition() +",working "+hours+
                " hours per week and his/her salary now is "+df1.format(salary);
        return result;
    }

}
