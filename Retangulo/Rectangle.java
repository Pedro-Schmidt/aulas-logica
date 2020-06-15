public class Rectangle {

    private double base;
    private double height;
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double calculateAreaOfRectangle() {
        return this.base * this.height;
    }
    
    public double calculatePerimeterOfRectangle() {
        return 2 * (this.base + this.height);
        //return 2 * this.base + 2 * this.height;        
    }
    
    @Override
    public String toString() {
        return "Base : " + this.base
             + "\nAltura : " + this.height
             + "\nÁrea: " + calculateAreaOfRectangle()
             + "\nPerímetro: " + calculatePerimeterOfRectangle();
    }

}