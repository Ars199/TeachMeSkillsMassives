public class IncapsPractice {
    private int age;
    private String fname;
    private String lname;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    private void call() {
        age = 35;
        fname = "Petya";
        lname = "Petin";
        System.out.println(age + " " + lname + " " + fname);
    }

    public void somePublicMethod() {
        call();
    }

}
