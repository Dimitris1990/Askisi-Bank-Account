package MyClasses;


public class Person {
    
    private String name;
    private int age;
    private BankAccount account;

    public Person() {
    }
    

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, BankAccount account) {
        this(name,age);
        this.account = account;
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

    public BankAccount getAccount() {
        return account;
    }
    
    public void accountCall(){
        
        System.out.println(name + ", " + age + " Balance: " + getAccount().getAmount());
    }
    
    
    //kolisa den ta katafera....
    
    
}
