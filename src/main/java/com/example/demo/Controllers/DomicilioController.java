/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controllers;

import com.example.demo.Entities.Domicilio;
import com.example.demo.Services.DomicilioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio,DomicilioService> {
    
}
