package uaslp.enginering.labs;

public class ComparadorNombres implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        Alumno alumnoleft = (Alumno)left;
        Alumno alumnoright = (Alumno)right;

        return alumnoleft.getFirstName().compareTo(alumnoright.getFirstName());
    }
}
