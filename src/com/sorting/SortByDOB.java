package com.sorting;
import java.util.Comparator;

public class SortByDOB implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().compareToIgnoreCase(o2.getName())<0) {
            return -1;
        }
        else if (o1.getName().compareToIgnoreCase(o2.getName())>0){
            return 1;
        }
        else {
            if(o1.getDep().compareToIgnoreCase(o2.getDep())<0) {
                return -1;
            }
            else if(o1.getDep().compareToIgnoreCase(o2.getDep())>0) {
                return 1;
            }
            else {
                if(o1.getSalary()<o2.getSalary()) {
                    return -1;
                }
                else if(o1.getSalary()>o2.getSalary()) {
                    return 1;
                }
                else {
                    if(o1.getDate().compareTo(o2.getDate())<0) {
                        return -1;
                    }
                    else if(o1.getDate().compareTo(o2.getDate())>0) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        }

    }

}