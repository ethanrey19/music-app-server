package me.ethan.dobbylistensapp.service;

import me.ethan.dobbylistensapp.model.Song;
import me.ethan.dobbylistensapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public Song store(MultipartFile file) {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        try {
            Song song = new Song(null,fileName,file.getContentType(), file.getBytes());
            return songRepository.save(song);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Song getFile(Long id) {
        return songRepository.findById(id).get();
    }

    public Stream<Song> getAllFiles() {
        return songRepository.findAll().stream();
    }

}
