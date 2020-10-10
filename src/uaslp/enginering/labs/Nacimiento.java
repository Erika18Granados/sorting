package uaslp.enginering.labs;

public class Nacimiento implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        Alumno alumnoleft = (Alumno)left;
        Alumno alumnoright = (Alumno)right;

        return alumnoleft.getBirthday().compareTo(alumnoright.getBirthday());
    }
}
