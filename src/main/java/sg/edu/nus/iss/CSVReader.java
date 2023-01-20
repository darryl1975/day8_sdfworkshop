package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static final String COMMA_DELIMITER = ",";

    public List<Employee> readCSV(String fileName) throws FileNotFoundException {
        BufferedReader fileReader = null;

        String line = "";
        List<Employee> employees = new ArrayList<Employee>();

        try {

            fileReader = new BufferedReader(new FileReader(fileName));

            // skipped the header row
            line = fileReader.readLine();

            // read the record line by line
            while ((line = fileReader.readLine()) != null) {
                String[] items = line.split(COMMA_DELIMITER);

                if (items.length > 0) {
                    Employee employee = new Employee(items[0], items[1], items[2], items[3], items[4], Integer.parseInt(items[5]));
                    employees.add(employee);
                } 
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return employees;
    }

}
