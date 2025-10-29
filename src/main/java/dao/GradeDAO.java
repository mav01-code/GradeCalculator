package dao;

public interface GradeDAO {
	public double calPercentage(int sub1, int sub2, int sub3);
	public char calGrade(double percentage);
}
