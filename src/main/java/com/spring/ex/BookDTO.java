package com.spring.ex;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BookDTO {
	@NotEmpty(message="제목 입력 누락")
	private String title;
	
	@NotEmpty(message="저자 입력 누락")
	@Length(min = 5, message = "5글자 이상으로 입력")
	private String author;
	
	@Pattern(regexp="^[0-9]+$", message="숫자만 입력가능합니다.")
	private String price;
	
	@NotEmpty(message="출판사 입력 누락")
	private String publisher;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}
