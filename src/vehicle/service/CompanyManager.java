package vehicle.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManager {
    public static String getCompany() throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> listCompany = new ArrayList<>();
        File file = new File("src/vehicle/data/hangSanXuat.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!=null){
            String data = line;
            listCompany.add(data);
        }
        for (int i = 0; i < listCompany.size(); i++) {
            System.out.println(i+1+":"+listCompany.get(i));
        }
        System.out.println("Chọn hãng sản xuất");
        int choice = Integer.parseInt(sc.nextLine());
        String company = listCompany.get(choice-1);
        String [] companyData = company.split("/");
        return companyData[1];
    }


}

