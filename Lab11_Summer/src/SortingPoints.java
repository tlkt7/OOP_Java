import java.util.Arrays;
import java.util.Random;

public class SortingPoints {
    public static void main(String[] args) {
        Point[] points = generateRandomPoints(100);
        System.out.println("Points sorted by x-coordinates:");
        Arrays.sort(points);
        for (Point point : points) {
            System.out.println(point.getX() + ", " + point.getY());
        }

        System.out.println("\nPoints sorted by y-coordinates:");
        Arrays.sort(points, new CompareY());
        for (Point point : points) {
            System.out.println(point.getX() + ", " + point.getY());
        }
    }

    private static Point[] generateRandomPoints(int count) {
        Point[] points = new Point[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            points[i] = new Point(x, y);
        }
        return points;
    }
}
