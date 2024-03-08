package games.courseApp;

public class Teacher {

    public String name;
    public String education;
    public int age;

    public Teacher(String name, String education, int age) {
        this.name = name;
        this.education = education;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", age=" + age +
                '}';
    }

}
