package com.jspiders.AppDTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_table")
public class AppDTO implements Serializable {
public AppDTO() {
	System.out.println("App object is created");
}
  @Id
  @Column(name="app_id")
  private int appid;
  @Column(name="app_name")
  private String name;
  @Column(name="app_type")
  private String type;
  @Column(name="app_version")
  private double version;
public int getAppid() {
	return appid;
}
public void setAppid(int appid) {
	this.appid = appid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getVersion() {
	return version;
}
public void setVersion(double version) {
	this.version = version;
}
  
}
