package me.ethan.dobbylistensapp.repository;

import me.ethan.dobbylistensapp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
