package ar.unahur.edu.obj2.patroncommand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;
import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

/**
 * ProgramaTest
 */
public class ProgramaTest {

  private Programa p = new Programa();
  private Programable micro = new Microcontrolador();

  @BeforeEach
  void setUp() {
    p.vaciarLista();
    micro.reset();
  }

  @Test
  void hacerAvanzar3PosicionesElProgramCounter() {
    Integer cantPos = 3;
    for (int i = 0; i < cantPos; i++) {
      p.agregarOpNop();
    }

    p.run(micro);

    assertEquals(cantPos, micro.getProgramCounter());
  }

  @Test
  void sumar20Mas17() {
    p.agregarOpLodv(20);
    p.agregarOpSwap();
    p.agregarOpLodv(17);
    p.agregarOpAdd();

    p.run(micro);

    assertEquals(37, micro.getAcumuladorA());
    assertEquals(0, micro.getAcumuladorB());
    assertEquals(4, micro.getProgramCounter());
  }

  @Test
  void sumar2Mas8Mas5(){
    p.agregarOpLodv(2);
    p.agregarOpStr(0);
    p.agregarOpLodv(8);
    p.agregarOpSwap();
    p.agregarOpLodv(5);
    p.agregarOpAdd();
    p.agregarOpSwap();
    p.agregarOpLod(0);
    p.agregarOpAdd();

    p.run(micro);

    assertEquals(15, micro.getAcumuladorA());   
    assertEquals(0, micro.getAcumuladorB());
    // assertEquals(9, micro.getProgramCounter());
  }
}
