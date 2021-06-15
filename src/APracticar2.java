public class APracticar2 {

    public static void main(String[] args) {

        char c = 'z'; // Convertir a Int
        int i1 = 250; // Convertir a long y de long a short
        double d1 = 301.067; // Convertir a long
        int i2 = 100; // Sumar 5000.66 y convertir a float
        int i3 = 737; // Multiplicar por 100 y convertir a byte
        double d2 = 298.638; // Dividir entre 25 y convertir a long

        int cI = (int) c; // Convertir a Int
        System.out.println(cI + " = Convertir a Int"); // Exactitud

        long convertI = i1; // Converitr a long...
        System.out.println(i1 + " = Convertir a long..."); // Exactitud
        short convertItoS = (short) convertI; // ...y de long a short
        System.out.println(convertItoS + " = ...y de long a short"); // Exactitud

        long convertToL = (long) d1; // Convertir a long
        System.out.println(convertToL + " = Convertir a long"); // Estimación

        float iSum = i2 + 5000.66f; // Sumar 5000.66 y convertir a float
        System.out.println(iSum + " = Sumar 5000.66 y convertir a float"); // Estimación

        i3 *= 100; // Multiplicar por 100...
        System.out.println(i3 + " = Multiplicar por 100..."); // Exactitud
        byte convertToB = (byte) i3; // ...y convertir a byte
        System.out.println(convertToB + " = y convertir a byte"); // Exactitud

        d2 /= 25; // Dividir entre 25...
        System.out.println(d2 + " = Dividir entre 35..."); // Exactitud
        long convertToLong = (long) d2; // ...y convertir a longç
        System.out.println(convertToLong + " = y convertir a long"); // Estimación
    }
}
