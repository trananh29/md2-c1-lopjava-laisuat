import java.util.Scanner;

public class laiSuat {
    public static void main(String[] args) {
        double month, money, interRest, laisuat;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        money=sc.nextDouble();
        System.out.println("Nhap so thang gui");
        month=sc.nextDouble();
        System.out.println("Nhap lai suat tien gui % tren 1 nam");
        laisuat=sc.nextDouble();
        sc.close();
        interRest=money*laisuat*month/(12*100);
        System.out.printf("So tien lai nhan duoc %f",interRest);
    }
}
