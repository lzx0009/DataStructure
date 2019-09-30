package day190924;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        student s1 = new student(2);
        student s2 = new student(3);
        student s3 = new student(2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}