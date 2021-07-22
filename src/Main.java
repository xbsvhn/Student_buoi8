import sample.HighShoolStudent;
import sample.Student;
import sample.UniversityStudent;

import java.rmi.Naming;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HighShoolStudent h1 = new HighShoolStudent(11, "Nam", "HN");
        UniversityStudent u1 = new UniversityStudent(12, "Ngu", "HN");
        ArrayList<Student> danhsach;
        danhsach = new ArrayList<>();

        danhsach.add(h1);//0
        danhsach.add(u1);//1
        

//        for (int i = 0; i < danhsach.size(); i++) {
//            danhsach.get(i).inputInfo();
//            danhsach.get(i).showInfo();
//        }
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).toString().contains("gu")) {
                danhsach.get(i).inputInfo();
                danhsach.get(i).showInfo();
                System.out.println(danhsach.get(i).toString());

            }
        }
    }
}
