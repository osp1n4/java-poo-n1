package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Noche implements Jornada{
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(18, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(23, 59);
    }
}