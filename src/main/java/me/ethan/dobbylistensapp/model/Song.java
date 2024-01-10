package me.ethan.dobbylistensapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "song_id")
    private Long songId;

    private String name;

    private String type;

    @Lob
    private byte[] data;

}
