public class Subject {

    private String name;
    private int currentGrade;

    public Subject(String name) {
        this.name = name;
        this.currentGrade = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(int currentGrade) {
        this.currentGrade = currentGrade;
    }



    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", currentGrade=" + currentGrade +
                '}';
    }
}
