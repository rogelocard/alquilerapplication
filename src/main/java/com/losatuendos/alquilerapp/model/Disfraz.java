package com.losatuendos.alquilerapp.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("DISFRAZ")
public class Disfraz extends Prenda {
    private String nombre;
}
