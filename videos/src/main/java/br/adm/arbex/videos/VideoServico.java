package br.adm.arbex.videos;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

@Service
public class VideoServico {

  @Autowired
  private VideoRepositorio videoRepository;

  public Video store(MultipartFile file) throws IOException {
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    Video video = new Video(fileName, file.getContentType(), file.getBytes());

    return videoRepository.save(video);
  }

  public Video getFile(Integer id) {
    return videoRepository.findById(id).get();
  }
  
  public Stream<Video> getAllFiles() {
    return videoRepository.findAll().stream();
  }
}
