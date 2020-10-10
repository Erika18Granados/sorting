package uaslp.enginering.labs;

public class ComparadorApellidos implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        Alumno alumnoleft = (Alumno)left;
        Alumno alumnoright = (Alumno)right;

        return alumnoleft.getLastName().compareTo(alumnoright.getLastName());
    }
}
