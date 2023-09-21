package org.example;

public class FabricaEstrangeiro implements FabricaAbstrata {
    public Documento createDocumento() {
        return new DocumentoEstrangeiro();
    }
}
