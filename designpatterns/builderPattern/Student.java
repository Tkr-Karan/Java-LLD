package designpatterns.builderPattern;

public class Student {
    private String name;
    private int age;
    private String university;
    private String batch;
    private double psp;
    private String email;

    // if we are using the validation and creation of obj at the same time in the Student class only, then
    // we can face some problem like multiple method and those mutliple methods can have the same signature
    // the violates the SOLID principle as well as show the compile time errors.

    // here the Builder class help us to create the Obj of the Student after doing some validation
    private Student(Builder b){
        // doing some validation and then creating the object
        this.name = b.name;
        this.age = b.age;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        private String name;
        private int age;
        private String university;
        private String batch;
        private double psp;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        boolean validate() {
            if (this.age < 18) {
                return false;
            }

            if (2000 + this.age > 2025) {
                return false;
            }

            return true;
        }
        public Student build() {
            if (!validate()) {
                throw  new RuntimeException();
            }
            return new Student(this);
        }
    }
}
