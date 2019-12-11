package com.tank.java8.methodRefrence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author tank
 * @create 2019/12/07 14:45
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//
//        System.out.println("-----------");
//
//        students.sort((s1, s2) -> Student.compareStudentByScore(s1, s2));
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        System.out.println("-----------");
//
//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));


        /*
             1.类名::静态方法名
         */
//        System.out.println("-----------");
//
//        students.sort((s1, s2) -> Student.compareStudentByName(s1, s2));
//        students.forEach(student -> System.out.println(student.getName()));
//
//        System.out.println("-----------");
//
//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

        /*
            2.实例对象名::实例对象名
         */
//        System.out.println("-----------");
//
//        StudentComparator studentComparator = new StudentComparator();
//        students.sort(studentComparator::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

//        System.out.println("-----------");
//
//        students.sort(Student::compareByScore);
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        students.sort(Student::compareByName);
//        students.forEach(student -> System.out.println(student.getName()));
//

        /*
            3.类名::实例方法名
         */
//        List<String> cities = Arrays.asList("qingdao", "chongqing", "tianjin", "beijing");
//        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
//        cities.forEach(System.out::println);
//
//        Collections.sort(cities, String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        /*
            4.构造方法引用：类名::new
         */
        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));

        System.out.println(methodReferenceTest.getString2("hello",String::new));

    }
}
