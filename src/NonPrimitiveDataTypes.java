import InterfaceExample.Developer;
import InterfaceExample.Person;
import InterfaceExample.Teacher;

import java.util.ArrayList;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {

        // string

        // so generally the string are stored on the string constant pool so here
        // the Gaurav string will present on the string constant pool and bo the variable will be
        // point th e same Gaurav value
        String person1_name = "Gaurav";
        String person2_name = "Gaurav";

        // compare the pointing address
        System.out.println(person1_name == person2_name);
        // compare the value
        System.out.println( person1_name.equals(person2_name));

        // Interface
        Person p1 = new Teacher();
        p1.sayHello();

        Teacher t1 = new Teacher();
        t1.sayHello();

        Developer dev1 = new Developer();
        dev1.sayHello();

        // array
        int arr[] = new int[10];
        arr[0] = 10;
        for (int a : arr) {
            System.out.println(a);
        }

        int cost[] = {1, 2, 3, 3, 3};
        for (int a : cost) {
            System.out.println(a);
        }

    }

}

