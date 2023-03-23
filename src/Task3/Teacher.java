package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach;
    ArrayList<String> currentCources = new ArrayList<>();
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }
    @Override
    public boolean AddCourse(String course) {
        if(canTeach.contains(course) && !currentCources.contains(course)){
            currentCources.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder(getName() + "\n");
        if(!canTeach.isEmpty()){
            output.append("can Teach:\n");
            for(String course: canTeach){
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
