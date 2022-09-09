package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\Curso Java\\Codigo Projeto\\ComparableJV\\src\\teste\\texto.txt";
        List<Employee> listaEmployee = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
        	String name = bufferedReader.readLine();
        	while(name != null) {
        		String[] vect = name.split(",");
        		listaEmployee.add(new Employee(vect[0], Double.parseDouble(vect[1])));
        		name = bufferedReader.readLine();
        	}
        	
        	Collections.sort(listaEmployee);
        	for(Employee emp : listaEmployee) {
        		System.out.printf("Name: %s  Salario: US$ %.2f\n", emp.getName(), emp.getSalario());
        	}
        	
        }catch(IOException error) {
        	System.out.println(error.getMessage());
        }
	}
}
