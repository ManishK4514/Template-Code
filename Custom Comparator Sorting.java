class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(s1.roll > s2.roll) return 1;
        else if(s1.roll < s2.roll) return -1;
        else return s1.name.compareTo(s2.name);
    }
}
class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }    
}
public class Main {
    public static void operation(ArrayList<Student> students){
        Collections.sort(students, new StudentComparator());
        for(int i  = 0; i < students.size(); i++){
            System.out.println(students.get(i).name + " " + students.get(i).roll);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Manish", 128);
        Student s2 = new Student("Ritik", 12);
        Student s3 = new Student("Raj", 88);
        Student s4 = new Student("Ravan", 18);
        Student s5 = new Student("Ram", 111);
        Student s6 = new Student("Rohan", 67);
        Student s7 = new Student("Piyush", 2);
        Student s8 = new Student("Nitish", 2);
        Student s9 = new Student("Sohan", 2);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        operation(list);
    }
}
