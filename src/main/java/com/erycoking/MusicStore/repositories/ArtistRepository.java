package com.erycoking.MusicStore.repositories;

import com.erycoking.MusicStore.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    /**
     * find artist by name
     * @param name
     * @return a List of artists
     */
    List<Artist> findAllByArtistName(String name);
    Artist findByArtistName(String name);

    /**
     * find a particular artist
     * @param name
     * @return artist
     */
    List<Artist> findBySongsContaining(String name);


}