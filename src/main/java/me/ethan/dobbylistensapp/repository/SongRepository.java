package me.ethan.dobbylistensapp.repository;

import me.ethan.dobbylistensapp.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SongRepository extends JpaRepository<Song, UUID> {
}
