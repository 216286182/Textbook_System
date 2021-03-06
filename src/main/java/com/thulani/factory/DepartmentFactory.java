package com.thulani.factory;

import com.thulani.entity.Department;

public class DepartmentFactory {
    public static Department createDepartment(String departmentNum, String departmentName){
        Department department = new Department.Builder().
                setDepartmentNum(departmentNum).
                setDepartmentName(departmentName).
                build();
        return department;
    }
}
