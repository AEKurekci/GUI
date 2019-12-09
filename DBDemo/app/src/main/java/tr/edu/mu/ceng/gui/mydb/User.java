package tr.edu.mu.ceng.gui.mydb;

public class User {

    String first;
    String last;
    String middle;
    Integer born;

    public User(String first, String last, String middle, Integer born) {
        this.first = first;
        this.last = last;
        this.middle = middle;
        this.born = born;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public Integer getBorn() {
        return born;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }
}
