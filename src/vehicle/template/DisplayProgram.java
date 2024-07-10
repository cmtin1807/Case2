package vehicle.template;

import java.util.Scanner;

public class DisplayProgram {
    public static int displayMenu(Scanner scanner) {
        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG----------");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Cập nhập phương tiện");
        System.out.println("5. Sắp xếp phương tiện");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static int getChoiceAddVehicle(Scanner scanner) {
        System.out.println("-----CHỨC NĂNG THÊM PHƯƠNG TIỆN-----");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm  xe máy");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceAdd = scanner.nextInt();
        scanner.nextLine();
        return choiceAdd;
    }

    public static int getChoiceDisplayVehicle(Scanner scanner) {
        System.out.println("-----CHỨC NĂNG HIỂN THỊ PHƯƠNG TIỆN-----");
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị ôtô");
        System.out.println("3. Hiển thị xe máy");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceDisplay = Integer.parseInt(scanner.nextLine());
        return choiceDisplay;
    }

    public static int getChoiceRemoveVehicle(Scanner scanner) {
        System.out.println("-----CHỨC NĂNG XÓA PHƯƠNG TIỆN-----");
        System.out.println("1. Xóa xe tải");
        System.out.println("2. Xóa ôtô");
        System.out.println("3. Xóa xe máy");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceRemove = Integer.parseInt(scanner.nextLine());
        return choiceRemove;
    }

    public static int getChoiceUpdateVehicle(Scanner scanner) {
        System.out.println("-----CHỨC NĂNG CẬP NHẬP PHƯƠNG TIỆN-----");
        System.out.println("1. Cập nhập xe tải");
        System.out.println("2. Cập nhập ôtô");
        System.out.println("3. Cập nhập xe máy");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceRemove = Integer.parseInt(scanner.nextLine());
        return choiceRemove;
    }
    public static int getChoiceSortVehicle(Scanner scanner) {
        System.out.println("-----CHỨC NĂNG SẮP XẾP PHƯƠNG TIỆN-----");
        System.out.println("1. Sắp xếp xe tải");
        System.out.println("2. Sắp xếp ôtô");
        System.out.println("3. Sắp xếp xe máy");
        System.out.println("0. Thoát");
        System.out.println("Enter chức năng lựa chọn của bạn");
        int choiceSort= Integer.parseInt(scanner.nextLine());
        return choiceSort;
    }
}