package ra.ss08.model;

public class User {
    private String name;
    private int age;
    private String birthday;
    private String email;
    private String phone;

    // Constructors
    public User() {}

    public User(String name, int age, String birthday, String email, String phone) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}