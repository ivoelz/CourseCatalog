package lab2;

public interface Course {
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();

    public abstract void setCredits(double credits);
}
