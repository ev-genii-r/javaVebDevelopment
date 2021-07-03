package task7;

public class EntityTask7 {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityTask7 that = (EntityTask7) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return (x+y)*31;
    }
}
