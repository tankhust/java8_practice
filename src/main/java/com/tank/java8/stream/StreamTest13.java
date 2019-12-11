package com.tank.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author tank
 * @create 2019/12/09 12:16
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);

        /*
            Stream分组  group by
         */
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
//        Map<String, List<Student>> map =
//                students.stream().collect(Collectors.groupingBy(Student::getName));
//        Map<Integer, List<Student>> map =
//                students.stream().collect(Collectors.groupingBy(Student::getAge));
//        Map<String, Long> map =
//                students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        Map<String, Double> map =
                students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getAge)));
        System.out.println(map);


        System.out.println("----------------");

        /*
            Stream分区  partition by
         */
        Map<Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map2);


    }
}
