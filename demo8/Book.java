package demo8;

import java.io.Serializable;

public class Book implements Serializable {
    private int bNo;
    private String bName;

    private String bAuthor;

    public int getBNo() {
        return bNo;
    }

    public void setBNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book(int bNo, String bName, String bAuthor) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }

    public Book(){

    }
}
