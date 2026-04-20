package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private float payRate;

    //Constructor
    public Employee(int employeeId, String name, double hoursWorked, float payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Getters and setters
        public int getEmployeeId () {
            return employeeId;
        }

        public void setEmployeeId ( int employeeId){
            this.employeeId = employeeId;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getHoursWorked () {
            return hoursWorked;
        }

        public void setHoursWorked ( double hoursWorked){
            this.hoursWorked = hoursWorked;
        }

        public float getPayRate () {
            return payRate;
        }

        public void setPayRate ( float payRate){
            this.payRate = payRate;
        }

        public double getGrossPay(){
        double total = payRate / hoursWorked;
        total = hoursWorked * total;
        total *= 52;
        return total;

        }


}
