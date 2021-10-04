package com.micron.client;

import com.micron.dto.GoRestUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient( url = "https://gorest.co.in", name = "go-rest")
public interface IGoRestClient {

    // @GetMapping(value = "/public/v1/users?access-token={accessToken}")
    @RequestMapping(method = RequestMethod.GET, value = "/public/v1/users?access-token={accessToken}")
    GoRestUserDTO getGoRestUsers(@PathVariable String accessToken);
}