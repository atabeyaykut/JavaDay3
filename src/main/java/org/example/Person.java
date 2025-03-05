package org.example;

public class Person {
        String firstname;
        String lastname;
        int age;

        int height;
        String email;
        String phoneNumber;

        public Person(String firstname, String lastname, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }

        public Person(String firstname, String lastname, int age, int height, String email, String phoneNumber) {
            this(firstname, lastname, age);
            this.height = height;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return firstname;
        }

        public String getLastName() {
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public boolean isTeen() {
            return age >= 13 && age <= 19;
        }
}
