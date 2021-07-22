package sample;

import java.util.Scanner;

public class HighShoolStudent extends Student {
    private int mathScore;
    private int physicsScore;
    private int chemicalScore;
    //Scanner sc = new Scanner(System.in);

    public HighShoolStudent(int ID, String name, String address) {
        super(ID, name, address);
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public int getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(int chemicalScore) {
        this.chemicalScore = chemicalScore;
    }

    @Override
    public void showInfo() {
        System.out.println("Highschool: " + this.name + this.mathScore + this.physicsScore + this.chemicalScore);
    }

    @Override
    public String toString() {
        return "HighShoolStudent{" +
                "mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", chemicalScore=" + chemicalScore +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        this.name = "Nam";
        this.mathScore = 9;
        this.physicsScore = 8;
        this.chemicalScore = 0;
//        System.out.println("Nhap diem Toan: ");
//        sc.nextInt();
//        System.out.println("Nhap diem Li: ");
//        sc.nextInt();
//        System.out.println("Nhap diem Hoa: ");
//        sc.nextInt();


    }
}
