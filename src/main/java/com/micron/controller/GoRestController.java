package com.micron.controller;

import com.micron.client.IGoRestClient;
import com.micron.dto.GoRestUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GoRestController {

    @Autowired
    private IGoRestClient goRestClient;

    @RequestMapping(method = RequestMethod.GET, value = "/public/v1/users?access-token={accessToken}")
    public GoRestUserDTO getGoRestUsers(@PathVariable String accessToken){
        return goRestClient.getGoRestUsers(accessToken);
    }

    // public GoRestUserDTO getGoRestUsers(@RequestHeader(name = "Authorization") String accessToken) {

    
}
