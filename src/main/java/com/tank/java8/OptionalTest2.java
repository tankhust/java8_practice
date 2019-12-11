package com.tank.java8;

import java.util.*;

/**
 * @author tank
 * @create 2019/12/07 14:14
 */
public class OptionalTest2
{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");
        Employee employee2 = new Employee();
        employee1.setName("lisi");
        Employee employee3 = new Employee();
        employee1.setName("wangwu");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
//        company.setEmployees(employees);

//        if (null != list) {
//            System.out.println(list);
//        }else{
//            System.out.println(new ArrayList<>());
//        }

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));
    }
}
