public class Point2D {

    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] =x;
        arr[1] =y;
        return arr;
    }
    public String toString(){
        return "Point 2D co gia tri la "+getXY();
    }

    public Point2D(){}
    public Point2D(float x, float y){
        this.x =x;
        this.y =y;
    }
    
}
