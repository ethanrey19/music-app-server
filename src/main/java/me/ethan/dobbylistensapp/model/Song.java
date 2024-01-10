package me.ethan.dobbylistensapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    @Id
    @Column(name = "song_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID songId;

    private String name;

    private String type;

    @Lob
    private byte[] data;

}
