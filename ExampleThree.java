public class ExampleThree {
    // Rotate a point counterclockwise by a given angle.
    static double[] rotate(double[] point, double angle) {
        double[] result = new double[2];
        result[0] = point[0] * Math.cos(angle) - point[1] * Math.sin(angle);
        result[1] = point[0] * Math.sin(angle) + point[1] * Math.cos(angle);
        return result;
        ""
    }


}
