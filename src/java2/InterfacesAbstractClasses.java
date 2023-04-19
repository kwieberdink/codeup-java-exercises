package java2;

// Abstract class: can serve as a superclass, but cannot be directly instantiated.
// Abstract methods: methods w/ no body, only provides information about the method name, return type, and parameters
public class InterfacesAbstractClasses {

    public static void main(String[] args) {
        // Employee is abstract, cannot be instantiated
//        Employees tim = new Employee(); // error
        Employees bob = new Accountant("Bob", "Accountant");
        Employees jeff = new Developerr("Jeffery","Developer");
        Employees barb = new Manager("Barbera","Manager");
    }

}


// Superclass
abstract class Employees {
    protected String name;
    protected String department;
// Constructor Start
    public Employees(String name, String department) {
        this.name = name;
        this.department = department;
    }
// Constructor End
// Getter/Setter Start
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
// Getter/Setter End
    public abstract String work();
}

// Subclass
class Accountant extends Employees {
// Super constructor required to in a class that extends to a super class to ensure that the superclass fields are properly initialized before any add fields specific to the subclass are initialized
    public Accountant(String name, String department) {
        super(name, department);
    }
    // work() required due to super class having the method
    public String work() {
        // Must define a work method bc it inherits from Employee and is not defined as abstract.
        return "crunching numbers";
        // Will return compile error with no work() method.
    }
}

// Subclass
class Developerr extends Employees {
    // Super constructor
    public Developerr(String name, String department) {
        super(name, department);
    }
    // work() required due to super class having the method
    public String work() {
        return "writing code";
    }
}
// Subclass
class Manager extends Employees {
    // Super constructor
    public Manager(String name, String department) {
        super(name, department);
    }
    // work() required due to super class having the method
    public String work() {
        return "holding meetings";
    }
}

