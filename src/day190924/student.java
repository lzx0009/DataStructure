package day190924;

public class student {
    private int id;

    public student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        student student = (student) o;
        if (this.id == student.id){
            return true;
        }else {
            return false;
        }
    }
}
