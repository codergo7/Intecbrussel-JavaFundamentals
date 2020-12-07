package be.intecbrussel.ex_4;

public class ShoePair implements Pair<Shoe>{

    private Shoe left;
    private Shoe right;

    public ShoePair(Shoe left, Shoe right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Shoe getLeft() {
        return left;
    }

    @Override
    public Shoe getRight() {
        return right;
    }

    @Override
    public void setLeft(Shoe left) {
        this.left = left;
    }

    @Override
    public void setRight(Shoe right) {
        this.right = right;
    }
}
class Shoe{

}