package me.ethan.dobbylistensapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "playlists")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {

    @Id
    @Column(name = "playlist_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID playlistId;

    // gonna have to play around with this later
    @OneToMany()
    private List<Song> songList;

}
