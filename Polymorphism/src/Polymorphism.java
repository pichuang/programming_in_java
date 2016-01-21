
/**
 * Created by roan on 2016/1/21.
 */
public class Polymorphism {
    public static void main(String args[]){
        Person p1 = new Student();
        Person p2 = new PHDStudent();
//        PHDStudent phd1 = new Student();
//        Teacher t1 = new Person();
        Student s1 =new PHDStudent();
//        s1 = p1;
//        s1 = p2;
        p1 = s1;
    }
}
