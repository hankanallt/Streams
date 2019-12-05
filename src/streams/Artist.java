
package streams;


public class Artist {

    
    String name;
    String lastname;
    String type;
    int age;
    Double Salary;

     public Artist(String name, String lastname, String type, int age, Double Salary) {
        this.name = name;
        this.lastname = lastname;
        this.type = type;
        this.age = age;
        this.Salary = Salary;
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
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", lastname=" + lastname + ", type=" + type + ", age=" + age + ", Salary=" + Salary ;
    }

    
}
