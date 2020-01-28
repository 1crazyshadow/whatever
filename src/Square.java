public class Square extends Rectangle {
    private double verticalLength;
    private double horizontalLength;

    @Override
    public double getArea() {
        return verticalLength * horizontalLength;
    }

    @Override
    public double getPerimeter() {
        return ( ( 2 * verticalLength ) + ( 2 * horizontalLength ) );
    }

    @Override
    public void setTopLength( final double topLength ) {
        horizontalLength = topLength;
    }

    @Override
    public void setRightLength( final double rightLength ) {
        verticalLength = rightLength;
    }

    @Override
    public void setBottomLength( final double bottomLength ) {
        horizontalLength = bottomLength;
    }

    @Override
    public void setLeftLength( final double leftLength ) {
        verticalLength = leftLength;
    }
}
