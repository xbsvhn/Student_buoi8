package sample;

import sample.Student;

import java.util.Scanner;

public class UniversityStudent extends Student {
    private double CPA;
    private String major;

    //Scanner sc = new Scanner(System.in);

    public UniversityStudent(int ID, String name, String address){
        super(ID, name, address);
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(float CPA) {
        this.CPA = CPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void showInfo() {
        System.out.println("University: " + this.name + this.major + this.CPA);
    }

    @Override
    public String toString() {
        return "UniversityStudent{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", CPA=" + CPA +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {

        this.name = "Nu";
        this.major = "Toach";
        this.CPA = 3.9;
//        System.out.println("Nhap CPA: ");
//        sc.nextInt();
//        System.out.println("Nhap nganh hoc: ");
//        sc.next();

    }
}
