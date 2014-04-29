/**
 * Created by Giuseppe on 4/22/2014.
 */

public class Test {

    public static void main(String[] args) {

        //Test Student Class
        Student s1 = new Student("John Doe", "1 Java Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println("Average is: " + s1.getAverageGrade());

        //Test Teacher CLass

        Teacher t1 = new Teacher("Paul Tan", " 8 Sunset Way");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102 ", "IM101"};
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }

        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
}

class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + " ( " + address + " ) ";
    }
}

class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student (String name, String address){
        super(name,address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        System.out.print(this);
        for(int i = 0; i < numCourses; i++){
            System.out.println(" " + courses[i] + " " + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade(){
        int sum =0;
        for(int i = 0 ; i< numCourses; i++){
            sum += grades[i];
        }
        return sum/numCourses;
    }
}

class Teacher extends Person{

    private int numOfCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address){
        super(name, address);
        numOfCourses = 0;
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString(){
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course){
        for (int i = 0; i < numOfCourses; i++){
            if(courses[i].equals(courses))
                return false;
        }

        courses[numOfCourses] = course;
        numOfCourses++;
        return true;
    }

    public boolean removeCourse(String course) {

        int courseIndex = numOfCourses;
        for (int i = 0; i < numOfCourses; i++) {
            if (courses[i].equals(courses)) {
                courseIndex = 1;
                break;
            }
        }

        if(courseIndex == numOfCourses){
            return false;
        }
        else {
            for( int i = courseIndex; i < numOfCourses -1 ; i++){
                courses[i] = courses[i + 1];
            }
        }

        numOfCourses--;
        return true;
    }
}
