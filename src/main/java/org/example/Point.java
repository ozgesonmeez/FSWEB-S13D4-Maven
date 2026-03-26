package org.example;

public record Point(int x, int y) {

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(Point point) {
        if (point == null) {
            System.out.println("point is null");
            return 0;
        }
        return distance(point.x, point.y);

    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

    }


}
