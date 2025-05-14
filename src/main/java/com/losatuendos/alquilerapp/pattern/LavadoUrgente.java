package com.losatuendos.alquilerapp.pattern;

import org.springframework.stereotype.Component;

//Patron Bridge y Adapter
@Component("urgente")
public class LavadoUrgente implements LavadoImplementacion {
    @Override public void lavar(LotePrendas lote){ /* envío con prioridad */ }
}
