package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("employees.csv");
        BufferedReader bufferedReader = new BufferedReader((fileReader));

        String line;

        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);


        }


    }
}
