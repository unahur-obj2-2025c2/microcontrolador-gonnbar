package ar.unahur.edu.obj2.patroncommand.operaciones;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

/**
 * Whnz
 */
public class Whnz extends Composite {

  public Whnz(List<Operable> operaciones) {
    super(operaciones);
  }

  @Override
  public void doExecute(Programable micro) {
    while (this.noEsCero(micro)) {
      super.doExecute(micro);
    }
  }

}
