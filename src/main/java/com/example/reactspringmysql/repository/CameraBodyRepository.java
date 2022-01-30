package com.example.reactspringmysql.repository;

import com.example.reactspringmysql.model.CameraBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CameraBodyRepository extends JpaRepository<CameraBody, Long> {

    Optional<CameraBody> findCameraBodyById(Long id);
}
