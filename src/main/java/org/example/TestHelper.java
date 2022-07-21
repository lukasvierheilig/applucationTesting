package org.example;

public class TestHelper {

    TestHelper2 testHelper2;

    public TestHelper(TestHelper2 testHelper2) {
        this.testHelper2 = testHelper2;
    }

    public String concat(String s1, String s2) {
        return s1 + s2;
    }

    public String greet(String person) {
        return testHelper2.getValue() + " " + person;
    }

}
