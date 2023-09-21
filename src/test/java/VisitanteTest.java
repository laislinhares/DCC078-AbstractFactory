import org.example.FabricaAbstrata;
import org.example.FabricaBrasileiro;
import org.example.FabricaEstrangeiro;
import org.example.Visitante;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitanteTest {

    @Test
    public void deveVerificarDocumentoBrasileiro() {
        FabricaAbstrata fabrica = new FabricaBrasileiro();
        Visitante visitante = new Visitante(fabrica);
        assertEquals("Verificar Identidade", visitante.VerificarDocumento());
    }

    @Test
    public void deveVerificarDocumentoEstrangeiro() {
        FabricaAbstrata fabrica = new FabricaEstrangeiro();
        Visitante visitante = new Visitante(fabrica);
        assertEquals("Verificar passporte", visitante.VerificarDocumento());
    }
}
