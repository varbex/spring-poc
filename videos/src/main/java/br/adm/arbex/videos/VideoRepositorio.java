package br.adm.arbex.videos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.adm.arbex.videos.Video;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VideoRepositorio extends JpaRepository<Video, Integer> {

}