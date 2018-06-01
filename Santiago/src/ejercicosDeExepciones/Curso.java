package ejercicosDeExepciones;

public class Curso {

    public Curso(int diaInicio, int mesInicio, int anioInicio, int diaFin, int mesFin, int anioFin) throws Exception {

        if (anioInicio > anioFin || 
                mesInicio > mesFin && anioInicio == anioFin || 
                diaInicio > diaFin && mesInicio == mesFin && anioInicio == anioFin) {
            throw new Error("La fecha de finalizacion de curso tiene que ser posterior a la de inico");
        }

        if (diaInicio == 0
                || mesInicio == 0
                || anioInicio == 0
                || diaFin == 0
                || mesFin == 0
                || anioFin == 0) {
            throw new Error("Tiene que ser una fecha valida");
        }

        validarDia(diaFin, mesFin);
        validarDia(diaInicio, mesInicio);

        validarMes(mesFin);
        validarMes(mesInicio);

    }

    private void validarDia(int dia, int mes) {//usar parentesis para separar la condiciones 

        if ((dia >= 30 && dia < 1) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            throw new Error("30 Dias maximos");
        }
        if ((dia >= 31 && dia < 1) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            throw new Error("31 Dias maximos");
        }
        if ((dia >= 28 && dia < 1) && (mes == 2)) {
            throw new Error("28 Dias maximo");
        }
    }

    private void validarMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new Error("Tiene que ser el mes valido");
        }
    }

}
