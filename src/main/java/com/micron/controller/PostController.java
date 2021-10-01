package com.micron.controller;

import com.micron.client.IPostClient;
import com.micron.dto.PostResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private IPostClient postClient;

    @PostMapping(value = "/posts")
    public PostResponseDto createPost(@RequestBody PostResponseDto responseDto){
        return postClient.createPost(responseDto);
    }

    @GetMapping(value = "/users/{id}/posts")
    public List<PostResponseDto> getAllPostsByUserId(@PathVariable Integer id){
        return postClient.getAllPostsByUserId(id);
    }
}
