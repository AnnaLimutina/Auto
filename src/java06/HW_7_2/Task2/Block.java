package java06.HW_7_2.Task2;

public class Block {
    int width;
    int length;
    int height;

    public Block(int[] array) {
        this.height = array[2];
        this.width = array[0];
        this.length = array[1];
    }


    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getVolume(){
        return width * length * height;
    }
    public int getSurfaceArea(){
        return 2 * width * length + 2 * length * height + 2 * width * height;
    }
}
