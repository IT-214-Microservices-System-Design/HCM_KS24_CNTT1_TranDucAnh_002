package com.rik.movieservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

@FeignClient(name = "genre-service")
public interface GenreClient {
    @GetMapping("/api/genres/{id}")
    ResponseEntity<Object> getGenreById(@PathVariable("id") Long id);
}
