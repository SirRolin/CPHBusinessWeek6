package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCources;
    ArrayList<String> currentCources = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCources) {
        super(name);
        this.passedCources = passedCources;
    }

    @Override
    public boolean AddCourse(String course) {
        if(passedCources.contains(course) || currentCources.contains(course)){
            return false;
        }
        currentCources.add(course);
        return true;
    }
    @Override
    public String toString(){
        StringBuilder output = new StringBuilder(getName() + "\n");
        if(!passedCources.isEmpty()){
            output.append("Passed cources:\n");
            for(String course: passedCources){
                output.append("  ").append(course).append("\n");
            }
        }
        if(!currentCources.isEmpty()){
            output.append("Current Courses:\n");
            for(String course: currentCources){
                output.append("  ").append(course).append("\n");
            }
        }
        return output.toString();
    }
}
