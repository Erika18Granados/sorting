package uaslp.enginering.labs;

public class Clave implements Comparator{

    public int compare(Object left, Object right) {
        Alumno alumnoleft = (Alumno)left;
        Alumno alumnoright = (Alumno)right;

        return alumnoleft.getClave()-alumnoright.getClave();
    }
}
