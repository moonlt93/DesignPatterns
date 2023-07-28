package IteratorPatterns;

public class IteratorsMain {
// 자료형에 관계 없이 이터레이터 인터페이스를 이용해서 순회하여 검색 구현이 가능하다.

    public static void main(String[] args) {
        Study_Group study = new Study_Group(3);
        study.AddStudent(new Student("김갑수",22));
        study.AddStudent(new Student("임갑수",24));
        study.AddStudent(new Student("감갑수",25));

        StudyGroupIterator iterator = study.iterators();


        while(iterator.hasNexts()){
            Student stu = (Student)iterator.nexts();
            System.out.println("이름: "+ stu.getName());
            System.out.println("나이: "+ stu.getAge());
            System.out.println("=====================");

        }

    }
}
