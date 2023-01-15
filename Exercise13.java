public class Exercise13 
{
    public static void main(String[] args)
    {
        Student jacob = new Student(101, "jacob", "pune");
        Student zyan = new Student(102, "zyan", "mumbai");
        Student sam = new Student(103, "sam", "delhi");
        Student anna = new Student(104, "anna", "mumbai");
   
        Student std[] = {jacob, zyan, sam, anna};
   
        System.out.println("Students from mumbai city are:");
        for(Student s:std)
        {
            if(s.city=="mumbai")
            {
            System.out.println(s);
            }
        }
    }
}
   
    class Student
    {
        int rollNo;
        String name;
        String city;
   
    Student(int rollNo, String name, String city)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }
   
    public String toString()
    {
     return rollNo+" "+name+" "+city;
    }
}