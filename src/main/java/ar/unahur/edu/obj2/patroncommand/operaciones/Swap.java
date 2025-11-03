package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

/**
 * Swap
 */
public class Swap extends Comando {

  @Override
  protected void doExecute(Programable micro) {
    Integer aux = micro.getAcumuladorA();
    micro.setAcumuladorA(micro.getAcumuladorB());
    micro.setAcumuladorB(aux);
  }

}
