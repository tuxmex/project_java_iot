package edu.students;

public class Student {
    private int studentId;
    private String name;
    private float age;
    private boolean married;
    

    public Student() {
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Student(int studentId, String name, float age, boolean married) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.setMarried(married);
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return this.age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", married='" + isMarried() + "'" +
            "}";
    }



    
}
