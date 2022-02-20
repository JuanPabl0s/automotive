package com.automotive.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -9202891129963853578L;
    @Schema(description = "car brand")
    private String brand;
    @Schema(description = "car model")
    private String model;
    @Schema(description = "car year")
    private String date;
}
