public class Student{
    String name;
    public String getName()
    {
        name="Tarun";
        return name;
    }
    public static void main(String[] args)
    {
        Student S = new Student();
        System.out.println(S.getName());
    }


}