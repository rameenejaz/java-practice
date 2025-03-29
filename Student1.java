public class Student1 {
    private int studentID;
    private String name;
    private String [] enrolledCourses;
    private int enrolledCount;
    public Student1 () {
        studentID=0;
        name="";
        enrolledCourses=new String[5];
        enrolledCount=0;
    }
    public Student1 (int studID, String studName, int count) {
        this.studentID=studID;
        this.name=studName;
        this.enrolledCount=count;
    }
    public void enrolledCourses(String courseName) {
        if (enrolledCount>=enrolledCourses.length) {
            System.out.println(name + " no more courses can be registered, limit reached!");
            return;
        }
        for (int i=0; i<enrolledCount; i++) {
            if (enrolledCourses[i].equals(courseName)) {
                System.out.println(name +" has already been enrolled in " + courseName);
            }
        }
        enrolledCourses[enrolledCount]=courseName;
        enrolledCount++;
        System.out.println(name + " has successfully enrolled in the " + courseName);
    }
    public void dropCourse (String courseName) {
        if (enrolledCount<=0) {
            System.out.println(name +" does not take " + courseName);
            return;
        }
        boolean found=false;
        for (int i=0; i<enrolledCount; i++) {
            if(enrolledCourses[i].equals(courseName)) {
                System.out.println("Removing " + courseName + " from " + name + "'s registered courses");
                found=true;
                // to move elements to the left
                for (int j=i; j<(enrolledCount-1); j++ ) {
                    enrolledCourses[j]=enrolledCourses[j+1];
                }
                enrolledCourses[enrolledCount-1]=null;
                enrolledCount--;
                System.out.println(name + " has successfully removed " + courseName);
            }
        }
        if (!found) {
            System.out.println(name + " is not enrolled in " + courseName);
        }
    }
    public void displayCourses() {
        if (enrolledCount==0) {
            System.out.println(name + " did not register any courses");
        }
        else {
            System.out.println(name + " registered in rhe following courses:");
            for (int i=0; i<enrolledCount; i++) {
                System.out.println(enrolledCourses[i] + "-");
            }
            System.out.println();
        }
    }
}

