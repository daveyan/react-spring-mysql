package com.example.reactspringmysql.model;

import com.example.reactspringmysql.enums.CameraBrand;
import com.example.reactspringmysql.enums.MountNames;
import com.example.reactspringmysql.enums.SensorSize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CameraBody implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private CameraBrand brand;
    private String productName;
    private MountNames cameraMount;
    private SensorSize sensorSize;
    private Double cost;

    public CameraBody(CameraBrand brand,String productName, MountNames cameraMount, SensorSize sensorSize, Double cost) {
        this.brand = brand;
        this.productName = productName;
        this.cameraMount = cameraMount;
        this.sensorSize = sensorSize;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CameraBody{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", cameraMount='" + cameraMount + '\'' +
                ", sensorSize=" + sensorSize +
                ", cost=" + cost +
                '}';
    }
}
