package com.automotive.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.sound.midi.Sequence;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CAR")
    @SequenceGenerator(name = "SEQ_CAR", sequenceName = "SEQ_CAR_PK", allocationSize = 1)
    private Long id;
    private String brand;
    private String model;
    private String date;
}
