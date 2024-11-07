package com.example.coad.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.ResponseBody;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name= "information")
@Setter
@Getter
public class NewsEntity {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     private int id;

     @Column
     private String title;

     @Column
    private String author;

     @Column
    private String url;
}
