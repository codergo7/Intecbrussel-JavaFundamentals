package be.intecbrussel.exercise_10;

import be.intecbrussel.exercise_8.Shape;

public class Drawing {

    private Shape[] shapes;
    private int size;

    {
        shapes = new Shape[100];
    }

    public void add(Shape shape) {
        boolean isPresent = isPresent(shape);
        if(isPresent){
            System.out.println("This shape is already exist in the list");
            return;
        }

        if (size < 100) {
            shapes[getFreeLocation()] = shape;
            size++;
        }
    }

    private boolean isPresent(Shape shape) {
        if(size==0) return false;
        for (int i = 0; i <shapes.length ; i++) {
            if(shapes[i]!=null && shapes[i].equals(shape)){
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation(){
        if(size==0) return 0;
        int free = 0;

        for (int i = 0; i <shapes.length ; i++) {
            if(shapes[i]==null){
                free = i;
                break;
            }
        }
        return free;
    }

    public void remove(Shape shape) {
        if (size == 0) return;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i]!=null && shapes[i].equals(shape)) {
              shapes[i] = null;
              size--;
              break;
            }
        }
    }

    /*
        public void remove(Shape shape){
            if(size==0) return;

            for(int i=0; i<shapes.length;i++){
                if(shapes[i].equals(shape)){
                    rearrangeArray(i);
                    i--;
                }
            }
        }

        private void rearrangeArray(int removedIndex) {
            Shape[] shapes1 = new Shape[100];
            for (int i = 0, j =0; i < shapes.length; i++,j++) {
                if(i==removedIndex){
                    this.size--;
                    j--;
                    continue;
                }
                shapes1[j] = shapes1[i];
            }
            shapes =shapes1;
        }
    */
    public void clear() {
        shapes = new Shape[100];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
