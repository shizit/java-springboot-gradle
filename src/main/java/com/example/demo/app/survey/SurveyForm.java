package com.example.demo.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class SurveyForm {
	
	@Min(value=0, message="0以上を入力してください")
	@Max(value=150, message="150以下を入力してください")
	private int age;
	
	@Min(1)
	@Max(5)
	private int satisfication;
	
	@Size(min = 1, max = 200, message = "200文字以内で入力してください")
	private String comment;
	
	public SurveyForm() {
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSatisfication() {
		return satisfication;
	}
	public void setSatisfication(int satisfication) {
		this.satisfication = satisfication;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
