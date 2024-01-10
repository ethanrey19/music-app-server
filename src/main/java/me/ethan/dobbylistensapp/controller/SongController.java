package me.ethan.dobbylistensapp.controller;

import me.ethan.dobbylistensapp.model.Song;
import me.ethan.dobbylistensapp.repository.SongRepository;
import me.ethan.dobbylistensapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;
import java.util.stream.Stream;

@CrossOrigin
@RestController
@RequestMapping("/api/song")
public class SongController {

    @Autowired
    private SongService songService;

    @Autowired
    private SongRepository songRepository;

    @PostMapping("/add")
    public ResponseEntity<Song> uploadSong (@RequestParam("file") MultipartFile file){
        Song song = songService.upload(file);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Song getSong(@PathVariable UUID id) {
       return songService.getFile(id);
    }


    @GetMapping("/all")
    public ResponseEntity<Stream<Song>> getAllSongs() {
        Stream<Song> audioFiles = songService.getAllFiles();
        return new ResponseEntity<>(audioFiles, HttpStatus.OK);
    }

}
