public class Person {
    private String name;
    private int age;
    

        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // ... constructor and getters
     @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person a = new Person("yeshu", 25);
        System.out.println(a.toString());
    }

}