class human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class scanner {
    public static void main(String[] args) {
        human obj = new human();
        obj.setAge(18);
        obj.setName("cyrus");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}