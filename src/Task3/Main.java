package Task3;

import java.util.ArrayList;

public class Main {
    static String[] courses = {"Chemistry", "Java 1.0", "Physics", "Math", "Technology"};
    static ArrayList<Person> persons = new ArrayList<>();
    public static void main(String[] args) {
        for(int studentID = 1; studentID <= 12;++studentID){
            persons.add(new Student("TestStudent" + studentID, getCoursesFromEnum(studentID)));
        }
        for(int teacherID = 1; teacherID <= 8;++teacherID){
            persons.add(new Teacher("TestTeacher" + teacherID, getCoursesFromEnum(teacherID)));
        }
        for(Person p: persons){
            System.out.println(p);
            if(!p.AddCourse(courses[1])) {
                if(p instanceof Student){
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                } else if (p instanceof Teacher){
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }

    private static ArrayList<String> getCoursesFromEnum(int enumNumber){
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i < courses.length; ++i){
            int pow = (int) Math.pow(2, i);
            if((enumNumber % (pow * 2)) >= pow){
                output.add(courses[i]);
            }
        }
        return output;
    }
}
