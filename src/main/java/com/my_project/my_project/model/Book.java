package com.my_project.my_project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//la persistencia es una clase ligera que persiste a una tabla en una bdd relacional
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="BOOK_TABLE")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name ="BOOD_ID")
    public long bokId;
    @Column(name="BOOD_TITLE")
    public String title;
    @Column(name="BOOD_AUTHOR")
    public String author;
    @Column(name="BOOD_PUBLISHED_YEAR")
    public String publishedYear;


}
