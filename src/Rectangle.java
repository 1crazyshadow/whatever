public class Rectangle implements Shape {
    final private int numSides = 4;
    private double[] sideLengths = new double[4];

    @Override
    public int getNumSides() {
        return numSides;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for ( double sideLength: sideLengths ) {
            perimeter += sideLength;
        }

        return perimeter;
    }

    /**
     * Returns the area of the rectangle
     * @return Top Side length times Right Side length
     */
    @Override
    public double getArea() {
        return sideLengths[0] * sideLengths[1];
    }

    public void setTopLength( final double topLength ) {
        sideLengths[0] = topLength;
    }

    public void setRightLength( final double rightLength ) {
        sideLengths[1] = rightLength;
    }

    public void setBottomLength( final double bottomLength ) {
        sideLengths[2] = bottomLength;
    }

    public void setLeftLength( final double leftLength ) {
        sideLengths[3] = leftLength;
    }
}
