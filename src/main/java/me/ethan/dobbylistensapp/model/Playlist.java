package me.ethan.dobbylistensapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "playlists")
public class Playlist {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "playlist_id")
    private Long playlistId;

}
