
//A class is a blueprint  for creating objects. It defines the structure and behavior
// of objects of that type. In simpler terms, a class is a set of instructions that defines what an
// object of that class will look like and what it can do.

// WHILE

//An object is an instance of a class. When you create an object, you are creating a real-world entity
// based on the blueprint defined by the class. Objects are the tangible entities that hold the state and
// behavior defined in the class.

public class Question4ii {
        String salary;
        int age;

        //assigning values to the attribute variables
        public Question4ii(){
            age = 20;
            salary = "1,000,000Shs";
        }
        //defining the main function
        //we also create a constructor to initialise an object
        //we then finally print the output
        public static void main(String[] args) {
            Question4ii newObj = new Question4ii();
            System.out.println(newObj.age + "years old");
            System.out.println(newObj.salary);
        }
    }




