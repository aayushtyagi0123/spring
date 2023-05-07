package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Demo {

@Value("#{30+10}")
int x;

@Value("#{20}")
int y;

@Value("#{T(java.lang.Math).sqrt(144)}")
int z;

@Value("#{T(java.lang.Math).PI}")
int z1;

@Value("#{new java.lang.String('Aayush')}")
String name;

@Value("#{8<3}")
boolean flag;

public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public int getZ1() {
	return z1;
}
public void setZ1(int z1) {
	this.z1 = z1;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}


public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", z1=" + z1 + ", name=" + name + ", flag=" + flag + "]";
}







	
}
