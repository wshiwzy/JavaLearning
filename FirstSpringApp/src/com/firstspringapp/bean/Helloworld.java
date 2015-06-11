package com.firstspringapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Helloworld {

	@Value("i love you")
	private String msg;

	@Value("12")
	private Integer age;

	@Autowired(required = false)
	private Stage stage;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void printMsg() {
		System.out.println("your message:" + msg + "\nage:" + age);
		stage.printStage();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Stage getStage() {
		return stage;
	}

}
