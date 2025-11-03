package ar.unahur.edu.obj2.patroncommand;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;
import ar.unahur.edu.obj2.patroncommand.operaciones.Add;
import ar.unahur.edu.obj2.patroncommand.operaciones.Lod;
import ar.unahur.edu.obj2.patroncommand.operaciones.Lodv;
import ar.unahur.edu.obj2.patroncommand.operaciones.Nop;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;
import ar.unahur.edu.obj2.patroncommand.operaciones.Str;
import ar.unahur.edu.obj2.patroncommand.operaciones.Swap;

/**
 * Programa
 */
public class Programa {

  List<Operable> operaciones;

  public Programa() {
    operaciones = new ArrayList<>();
  }

  public void agregarOpNop() {
    operaciones.add(new Nop());
  }

  public void agregarOpAdd() {
    operaciones.add(new Add());
  }

  public void agregarOpSwap() {
    operaciones.add(new Swap());
  }

  public void agregarOpLod(Integer dirEnMem) {
    operaciones.add(new Lod(dirEnMem));
  }

  public void agregarOpStr(Integer dirEnMem) {
    operaciones.add(new Str(dirEnMem));
  }

  public void agregarOpLodv(Integer value) {
    operaciones.add(new Lodv(value));
  }

  public void vaciarLista() {
    operaciones.clear();
  }

  public void run(Programable micro) {
    micro.run(operaciones);
  }
}
