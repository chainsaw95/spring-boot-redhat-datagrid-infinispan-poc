package com.codevivek.jdbexample.redhatjdgdemo.models;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Entity
@Table(name="Users")
public class User implements Serializable {

    @Id
    private String pan;

    private String firstName;
    private String lastName;
}
