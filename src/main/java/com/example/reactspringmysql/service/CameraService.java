package com.example.reactspringmysql.service;

import com.example.reactspringmysql.model.CameraBody;
import com.example.reactspringmysql.repository.CameraBodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CameraService {

    private final CameraBodyRepository cameraBodyRepository;

    @Autowired
    public CameraService(CameraBodyRepository cameraBodyRepository) {
        this.cameraBodyRepository = cameraBodyRepository;
    }

    public List<CameraBody> getCameraBodies() {
        return cameraBodyRepository.findAll();
    }

    public Optional<CameraBody> getCameraBodyById(Long id) {
        return cameraBodyRepository.findCameraBodyById(id);
    }
}
