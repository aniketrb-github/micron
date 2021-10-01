package com.micron.client;

import com.micron.dto.PostResponseDto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "user-client")
public interface IPostClient {

    @PostMapping(value = "/posts")
    //@Headers(value = "Content-Type: application/json; charset=UTF-8")
    @Headers({"Content-Type: application/json", "charset=UTF-8"})
    public PostResponseDto createPost(@RequestBody PostResponseDto responseDto);

    @GetMapping(value = "/users/{id}/posts")
    public List<PostResponseDto> getAllPostsByUserId(@PathVariable Integer id);
}

/*
How to use headers in Feign for POST API
https://www.tabnine.com/code/java/classes/feign.Headers

API's with/without Key for Practise
https://mixedanalytics.com/blog/list-actually-free-open-no-auth-needed-apis/
https://github.com/public-apis/public-apis#weather

 */