package ru.rxnnct.GraphQLGuestbook.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Entity
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "text")
    private String text;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    private transient String formattedDate;

    public String getFormattedDate() {
        return getCreationDate().toString();
    }
}
