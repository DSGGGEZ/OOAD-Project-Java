import java.util.ArrayList;
import java.util.*;

public class Zoo {

    String name;
    double area;
    int sizeOfZoo = 0;
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public Zoo(String name, double area) {
        this.name = name;
        this.area = area;

    }

    public void addAnimal(Animal ann) {
        animals.add(ann);
    }

    public int getSizeOfZoo() {
        return animals.size();
    }
}

public class Animal {
    String name;
    String type;
    String age;
    String gender;

    public Animal(String name, String type, String age, String gender) {

        this.name = name;
        this.type = type;
        this.age = age;
        this.gender = gender;
    }
}

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zoo nozha = new Zoo("nozha", 100);
        while (true) {
            int x=0;
            Animal lion = new Animal("lion", "fine", "20", "male");
            nozha.addAnimal(lion);

            Animal tiger = new Animal("tiger", "ssc", "30", "female");
            nozha.addAnimal(tiger);

            String name = sc.nextLine();
            String type = sc.nextLine();
            String age = sc.nextLine();
            String gender = sc.nextLine();

            Animal [x] (name, type, age, gender);
            x+=1;


        }
        System.out.println("Number of animals in zoo: " + nozha.getSizeOfZoo());
    }
}