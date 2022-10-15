package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private int sub1Marks;
private int sub2Marks;
private int sub3Marks;
private int sub4Marks;
private int sub5Marks;
private int sub6Marks;
private double percentage;

public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSub1Marks() {
	return sub1Marks;
}
public void setSub1Marks(int sub1Marks) {
	this.sub1Marks = sub1Marks;
}
public int getSub2Marks() {
	return sub2Marks;
}
public void setSub2Marks(int sub2Marks) {
	this.sub2Marks = sub2Marks;
}
public int getSub3Marks() {
	return sub3Marks;
}
public void setSub3Marks(int sub3Marks) {
	this.sub3Marks = sub3Marks;
}
public int getSub4Marks() {
	return sub4Marks;
}
public void setSub4Marks(int sub4Marks) {
	this.sub4Marks = sub4Marks;
}
public int getSub5Marks() {
	return sub5Marks;
}
public void setSub5Marks(int sub5Marks) {
	this.sub5Marks = sub5Marks;
}
public int getSub6Marks() {
	return sub6Marks;
}
public void setSub6Marks(int sub6Marks) {
	this.sub6Marks = sub6Marks;
}

}
