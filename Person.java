public class Person {
    private String name;
    private String gender;
    private String koleg;
    private int age;
    private int id ;


    public Person(String name, String gender, String koleg, int id, int age){
        this.name = name;
        this.gender = gender;
        this.koleg = koleg;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKoleg() {
        return koleg;
    }

    public void setKoleg(String koleg) {
        this.koleg = koleg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id =id;
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("koleg: " + koleg);
        System.out.println("Age: " + age);
        System.out.println("id: " + id );
        System.out.println( );
    }
}
