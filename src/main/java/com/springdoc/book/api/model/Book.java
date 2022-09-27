package com.springdoc.book.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "description")
	private String description;

	public Book(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", title=" + title + ", author=" + author + ", desc=" + description + "]";
	}

}
