package org.example;

public class FabricaBrasileiro implements FabricaAbstrata {

    public Documento createDocumento() {
        return new DocumentoBrasileiro();
    }
}
