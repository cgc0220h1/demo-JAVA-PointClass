public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed,ySpeed};
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "("
                + super.getX()
                + " , "
                + super.getY()
                + ")"
                + " , "
                + " speed = "
                + "("
                + xSpeed
                + " , "
                + ySpeed
                + ")";
    }

    public MovablePoint move(MovablePoint movablePoint) {
        movablePoint.setX(movablePoint.getX() + xSpeed);
        movablePoint.setY(movablePoint.getY() + ySpeed);
        return this;
    }
}
