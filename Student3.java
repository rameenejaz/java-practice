import java.util.Scanner;
    class Student3 extends Person3{
        private String program;
        public Student3 () {
            program="";
        }
        public Student3(String p) {
            program=p;
        }
        public void display () {
            System.out.println(" Program " + program);
        }
    }
