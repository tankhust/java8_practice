package com.tank.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author tank
 * @create 2019/12/07 12:01
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();

        List<Person> personResult = test.getPersonByName("zhangsan", list);
        personResult.forEach(person -> System.out.println(person.getUsername()));

        System.out.println("----------------");

        List<Person> personByAge = test.getPersonByAge(20, list);
        personByAge.forEach(person -> System.out.println(person.getAge()));

        System.out.println("----------------");
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) ->
            personList.stream().filter(person -> person.getAge() <= ageOfPerson).collect(Collectors.toList());

        List<Person> personByAge2 = test.getPersonByAge2(20, list, biFunction);
        personByAge2.forEach(person -> System.out.println(person.getAge()));

        System.out.println("----------------");
        BiFunction<Integer, List<Person>, List<Person>> biFunction2 = (ageOfPerson, personList) ->
                personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());

        List<Person> personByAge3 = test.getPersonByAge2(20, list, biFunction2);
        personByAge3.forEach(person -> System.out.println(person.getAge()));

    }

    public List<Person> getPersonByName(String name, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(name)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> {
            return personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }

}
