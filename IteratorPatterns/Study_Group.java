package IteratorPatterns;

import java.util.Iterator;

public class Study_Group implements Aggregate{

    private Student [] students;
    private int num = 0;

    public Study_Group(int num){
        this.students = new Student[num];
    }

    public Student getStudent(int index){
        return this.students[index];
    }

    public void AddStudent(Student student){
        this.students[num] = student;
        num++;
    }
    public int getLength(){
        return num;
    }
    public StudyGroupIterator iterators(){
        return new StudyGroupIterator(this);
    }

}
