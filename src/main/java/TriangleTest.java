public class TriangleTest
{
    public static void triangle(int a, int b, int c) {
        if (a + b >= c) {
            if (b + c >= a)
                if (a + c >= b)
                    System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник не существует");
        }
    }

}
