import java.util.Scanner;
public class Person {
    private String name;
    private int ID;
    public Person() {
        name="";
        ID=0;
    }
    public Person(String name, int ID) {
        this.name=name;
        this.ID=ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID=ID;
    }

    //MAIN FUNCTION
    public static void main(String[] args) {
        Person [] person=new Person [5];
        int countPersons=0;
        int option=-99;
        int position=-99;
        Scanner input=new Scanner(System.in);
        while(option!=0) {
            System.out.println("Choose one the following options (1-3) or 0 to exit");
            System.out.println("1. To create person");
            System.out.println("2.To display Person");
            System.out.println("3. To delete person by index");
            System.out.println("4. To display person by ID");
            System.out.println("0: To exit");
            System.out.print("Enter your choice:");
            option=input.nextInt();
            switch(option) {
                case 1:
                if(countPersons<person.length) {
                    input.nextLine();
                    System.out.print("Enter name:");
                    String name=input.nextLine();
                    // input.nextLine();
                    System.out.print("Enter ID:");
                    int ID=input.nextInt();
                    person[countPersons]=new Person(name,ID);
                    countPersons++;
                    System.out.println("Person has been created!");
                }
                else {
                    System.out.println("Array is full, no further person can be added");
                }
                break;
                case 2:
                for (int i=0; i<countPersons; i++) {
                    System.out.println("Name: " + person[i].getName() + "  and ID: " + person[i].getID());
                }
                break;
                case 3:
                System.out.println("Enter the index to delete (0 to " + (countPersons-1) + "):");
                int index = input.nextInt();
                if (index >= 0 && index < countPersons) {
                System.out.println("Deleting: Name: " + person[index].getName() + ", ID: " + person[index].getID());
                person[index] = person[countPersons - 1]; // Replace with last person
                person[countPersons - 1] = null;
                countPersons--;
                } 
                else {
                    System.out.println("Invalid index!");
                }
                break;
                case 4:
                System.out.print("Enter ID to search: ");
                int inputID = input.nextInt();
                boolean found = false;

                for (int i = 0; i < countPersons; i++) {
                    if (inputID == person[i].getID()) {
                    System.out.println("Person found: Name: " + person[i].getName() + ", ID: " + person[i].getID());
                    found = true;
                    break;
                    }
                }

                if (!found) {
                System.out.println("No person found with ID " + inputID);
                }
                break;
                case 0:
                return;
            }

        }
    }
}
