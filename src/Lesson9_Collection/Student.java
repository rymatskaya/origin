package Lesson9_Collection;

public class Student {
    private String name;
    private String group;
    protected Integer course;
    private Integer mark;

    public Student(String name, String group, Integer course, Integer mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public Integer getMark() {
        return mark;
    }


    public Integer getCourse() {
        return course;
    }


    @Override
    public String toString() {
        return "Имя: " + this.name
                + ", группа: " + this.group
                + ", курс: " + this.course
                + ", отметка: " + this.mark;
    }
}
