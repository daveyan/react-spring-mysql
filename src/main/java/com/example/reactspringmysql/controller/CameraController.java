package com.example.reactspringmysql.controller;

import com.example.reactspringmysql.model.CameraBody;
import com.example.reactspringmysql.service.CameraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/camera")
@Slf4j
public class CameraController {

    private final CameraService cameraService;

    @Autowired
    public CameraController(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @GetMapping("/")
    public ResponseEntity<List<CameraBody>> getCameraBodies() {
        var cameraBodies = cameraService.getCameraBodies();
        return ResponseEntity.ok(cameraBodies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<CameraBody>> getCameraBodyById(@PathVariable Long id) {
        var cameraBody = cameraService.getCameraBodyById(id);

        //Empty Array if nothing is found
        var foundCamera = new ArrayList<CameraBody>();

        cameraBody.ifPresent(foundCamera::add);

        return ResponseEntity.ok(foundCamera);
    }

}
