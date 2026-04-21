package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader bufferedReader = new BufferedReader((fileReader));

        String line;

        while((line = bufferedReader.readLine()) != null){
            if (line.trim().isEmpty()){
                continue;
            }

            String[] parts = line.split("\\|");

            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            double hoursWorked = Double.parseDouble(parts[2].trim());
            double payRate = Double.parseDouble(parts[3].trim());

            Employee employee = new Employee(id, name, hoursWorked, payRate);

            System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getGrossPay());


        }
        bufferedReader.close();


    }
}
