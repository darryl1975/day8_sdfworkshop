package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";

    public List<Employee> employees = null;
    
    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // create some employees
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "darrylng@nus.edu.sg", 20000);
        Employee emp2 = new Employee("23456", "Dennis Ng", "SS", "Lecturer", "dennisng@nus.edu.sg", 15000);
        Employee emp3 = new Employee("54354", "Dendon Ng", "SS", "Lecturer", "dendonng@nus.edu.sg", 25000);

        // add the employee to the list of employees
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        // write FILE_HEADER to CSV
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);

        // read records row by row and write it using fw.append()
        for(Employee e : employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPERATOR);
        }

        // flush to confirm writing to file and close the FileWriter object
        fw.flush();
        fw.close();
    }
}
