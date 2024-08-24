package baitapgiaiphuongtrinhbacnhat;

import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a");
        Double a = sc.nextDouble();
        System.out.println("Nhap vao b");
        Double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            Double x = -b/a;
            System.out.println("Nghiem cua phuong trinh la: x = "+ x);
            }
        }

    }


