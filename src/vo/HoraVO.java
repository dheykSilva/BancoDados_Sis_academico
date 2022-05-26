package vo;

import java.util.Timer;

public class HoraVO {
    
    private Timer horaInicio;
    private Timer horaTermino;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Timer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timer getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(Timer horaTermino) {
        this.horaTermino = horaTermino;
    }
}