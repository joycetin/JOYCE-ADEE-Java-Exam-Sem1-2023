import java.util.List;

public class Question4iii {
//giving the modifier
    private float width;

    private List<String> boxes;

    //the instructror for the width
    public Question4iii(int width) {
        this.width = width;
    }

    public Question4iii(int width, List<String> boxes) {
        this.width = width;
        this.boxes = boxes;
    }


    //getter for the width attribute
    public float getWidth() {
        return width;
    }
    //setter for the width attribute
    public void setWidth(int width) {
        this.width = width;
    }

    public void addBox(String box) {
        boxes.add(box);
    }
    public static void main(String[] args) {
        Question4iii box = new Question4iii(2);
        System.out.println("Box number" + box.getWidth());

        box.addBox("box1");
    }

    public List<String> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<String> boxes) {
        this.boxes = boxes;
    }
}
