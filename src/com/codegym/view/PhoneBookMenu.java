package com.codegym.view;

import com.codegym.controller.phonebook.PhoneBookManagement;
import com.codegym.model.Personinfo;

import java.util.Scanner;

public class PhoneBookMenu {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        PhoneBookManagement phoneBookManagement = new PhoneBookManagement();
        int choice = -1;
        do {
            menu();
            System.out.println("Chọn chức năng:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showAllPhoneBook(phoneBookManagement);
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    showCreatePhoneBook(phoneBookManagement);
                    break;
                }
                case 3: {
                    scanner.nextLine();
                    showFixPhonebook(phoneBookManagement);
                    break;
                }
                case 4: {
                    scanner.nextLine();
                    showErasePhoneBook(phoneBookManagement);
                    break;
                }
                case 5:{
                    scanner.nextLine();
                    showFindByName(phoneBookManagement);
                    break;
                }
            }
        } while (choice != 0);
    }


    private void showFindByName(PhoneBookManagement phoneBookManagement){
        System.out.println("Nhập tên cần tìm ");
        String name = scanner.nextLine();
        int index = phoneBookManagement.findByName(name);
        if (index == -1) {
            System.out.println("Không có ");
        } else {
            System.out.println(phoneBookManagement.getByIndex(index));
        }
    }
    private void showErasePhoneBook(PhoneBookManagement phoneBookManagement) {
        System.out.println("Nhập số điện thoại cần xóa");
        String phonenumber = scanner.nextLine();
        int index = phoneBookManagement.findPersoninfoByPhonenumber(phonenumber);
        if (index == -1) {
            System.out.println("Số điện thoại không chính xác!");
        } else {
            phoneBookManagement.delete(index);
            System.out.println("Xóa thành công!");
        }
    }

    private void showFixPhonebook(PhoneBookManagement phoneBookManagement) {
        System.out.println("Nhập số điện thoại cần sửa: ");
        String phonenumber = scanner.nextLine();
        int index = phoneBookManagement.findPersoninfoByPhonenumber(phonenumber);
        if (index == -1) {
            System.out.println("Số điện thoại không chính xác!");
        } else {
            Personinfo personinfo = inputPersonInfo();
            phoneBookManagement.update(index, personinfo);
            System.out.println("Cập nhật thành công!");
        }
    }

    private void showCreatePhoneBook(PhoneBookManagement phoneBookManagement) {
        System.out.println("Thêm mới");
        Personinfo personinfo = inputPersonInfo();
        phoneBookManagement.addNew(personinfo);
    }

    private Personinfo inputPersonInfo() {
        System.out.println("Số điện thoại");
        String phonenumber = scanner.nextLine();
        System.out.println("Nhóm danh bạ");
        String group = scanner.nextLine();
        System.out.println("Họ tên");
        String name = scanner.nextLine();
        System.out.println("Giới tính");
        String sex = scanner.nextLine();
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Ngày sinh");
        String dateofbirth = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();
        Personinfo personinfo = new Personinfo(phonenumber, group, name, sex, address, dateofbirth, email);
        return personinfo;
    }

    private void showAllPhoneBook(PhoneBookManagement phoneBookManagement) {
        int size = phoneBookManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            phoneBookManagement.displayAll();
        }
    }

    private void menu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");

    }
}
