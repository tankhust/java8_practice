package com.tank.java8.methodRefrence;

/**
 * @author tank
 * @create 2019/12/07 14:54
 */
public class StudentComparator {
    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }
    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
