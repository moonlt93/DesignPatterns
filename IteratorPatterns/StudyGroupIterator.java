package IteratorPatterns;

import java.util.Iterator;

public class StudyGroupIterator implements Iterators {
    private Study_Group study_group;
    private int index;

    public StudyGroupIterator(Study_Group study_group){
        this.study_group = study_group;
        this.index= 0;
    }

    public boolean hasNexts(){

    return index < study_group.getLength() ? true : false;

    }

    public Object nexts(){
        Student student = study_group.getStudent(index);
        index++;
        return student;
    }


}
