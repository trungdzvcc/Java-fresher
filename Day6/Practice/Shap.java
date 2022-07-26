package Day6.Practice;

public class Shap {
    private String color = "Green";
    private boolean field = true;
    
    public Shap(String color, boolean field) {
        this.color = color;
        this.field = field;
    }
    
    public Shap() {
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isField() {
        return field;
    }
    public void setField(boolean field) {
        this.field = field;
    }
    public String toString() {
        return  "A Shape with color of "+getColor()+" and "+ (isField()?" field":" not field") ;
    }
    
}
