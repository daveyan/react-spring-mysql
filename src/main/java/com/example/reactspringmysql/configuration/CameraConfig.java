package com.example.reactspringmysql.configuration;

import com.example.reactspringmysql.enums.CameraBrand;
import com.example.reactspringmysql.enums.MountNames;
import com.example.reactspringmysql.enums.SensorSize;
import com.example.reactspringmysql.model.CameraBody;
import com.example.reactspringmysql.repository.CameraBodyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CameraConfig {

    @Bean
    CommandLineRunner commandLineRunner(CameraBodyRepository cameraBodyRepository) {
        return args -> {
            CameraBody test1 = new CameraBody(CameraBrand.SONY,"A7" ,MountNames.A_MOUNT, SensorSize.FULL_FRAME, 2000.00);
            CameraBody test2 = new CameraBody(CameraBrand.SONY,"A7S III", MountNames.A_MOUNT, SensorSize.FULL_FRAME, 2000.00);

            cameraBodyRepository.saveAll(List.of(test1,test2));
        };
    }
}
