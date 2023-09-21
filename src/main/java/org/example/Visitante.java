package org.example;

public class Visitante {

    private Documento documento;

    public Visitante(FabricaAbstrata fabrica) {
        this.documento = fabrica.createDocumento();
    }

    public String VerificarDocumento() {
        return this.documento.verificar();
    }
}
