package lab1;

public class Main {
    public static void main(String[] args)
    {
        IntroJavaCourse introJ = new IntroJavaCourse("Introduction to Java", "J100");
        IntroToProgrammingCourse introP = new IntroToProgrammingCourse("Intro to Prog with Go", "P101");
        AdvancedJavaCourse advJ = new AdvancedJavaCourse("Advanced Java with Algorithms", "AJ200");
        System.out.println(introJ.getCourseNumber());
        System.out.println(introP.getCourseName());
        System.out.println(advJ.getCourseNumber());
    }
}
