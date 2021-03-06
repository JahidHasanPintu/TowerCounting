package towercounting;

public class Disk { 
    //Constants 
    protected static final int THICKNESS = 18;
    
    //Instance Variables
    private int size; 
    
    /**
     * Initializes a disk with a certain size.
     * @param size The size of the disk.
     */
    public Disk(int size) {
        this.size = size;
    }
    
    /**
     * Returns the size of the specific disk.
     * @return The size of the specific disk.
     */
    public int getSize() {
        return size;
    }
}