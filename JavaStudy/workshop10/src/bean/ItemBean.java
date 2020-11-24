package bean;

import java.util.Date;

public class ItemBean {
    private int id;
    private String name;
    private int price  ;
    private Date insert_date;
    private String image_url;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setInsert_date(Date date) {
        this.insert_date = date;
    }

    public Date getInsert_date() {
        return this.insert_date;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url() {
        return this.image_url;
    }
}