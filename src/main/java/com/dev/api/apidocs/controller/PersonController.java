/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.api.apidocs.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@Api(tags = {"Person API"})
public class PersonController {
    @RequestMapping(method = RequestMethod.GET, path = "/welcome")
    public String welcome() {
        return "My API";
    }
    
    
}
