package me.ethan.dobbylistensapp.controller;

import me.ethan.dobbylistensapp.model.Song;
import me.ethan.dobbylistensapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.stream.Stream;

@CrossOrigin
@RestController
@RequestMapping("/api/song")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping("/add")
    public ResponseEntity<Song> uploadFile (@RequestParam("file") MultipartFile file){
        Song song = songService.store(file);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> getSong(@PathVariable Long id) {
        Song audioFile = songService.getFile(id);
        return new ResponseEntity<>(audioFile, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Stream<Song>> getAllSongs() {
        Stream<Song> audioFiles = songService.getAllFiles();
        return new ResponseEntity<>(audioFiles, HttpStatus.OK);
    }

}
