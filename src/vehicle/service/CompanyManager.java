package vehicle.service;

import vehicle.model.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManager {
    public static String linkFileCompany= "src/vehicle/data/hangSanXuat.csv";
    public static File fileCompany = new File(linkFileCompany);
    static List<String> listCompany = new ArrayList<>();
    public static void loadFileCompany(File fileCompany, List<String> listCompany) {
        try {
            listCompany.clear();
            BufferedReader readerFileCompany = new BufferedReader(new FileReader(fileCompany));
            String lineCompany;
            while ((lineCompany = readerFileCompany.readLine()) != null) {
                String dataCompany = lineCompany;
                listCompany.add(dataCompany);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileCompany);
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + fileCompany);
        }
    }

    public static String getCompany() {
        Scanner scanner = new Scanner(System.in);
        loadFileCompany( fileCompany, listCompany);
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println(i+1+":"+listCompany.get(i));
        }
        System.out.println("Chọn hãng sản xuất");
        int choice = Integer.parseInt(scanner.nextLine());
        String company = listCompany.get(choice-1);
        String [] companyData = company.split("/");
        return companyData[1];
    }


}

