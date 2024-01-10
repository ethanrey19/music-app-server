package me.ethan.dobbylistensapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "song_id")
    private Long songId;
}
