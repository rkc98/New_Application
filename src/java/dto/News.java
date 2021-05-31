/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author hamee_000
 */
public class News {
    private int nid;
    private String heading,category,content,image,slider;
    private Date date;
    private boolean approved;

    public int getNid() {
        return nid;
    }

    public String getSlider() {
        return slider;
    }

    public void setSlider(String slider) {
        this.slider = slider;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public News() {
    }

    public News(int nid, String heading, String category, String content, Date date, String image, boolean approved,String slider) {
        this.nid = nid;
        this.heading = heading;
        this.category = category;
        this.content = content;
        this.image = image;
        this.date = date;
        this.approved = approved;
        this.slider=slider;
        
    }

    @Override
    public String toString() {
        return "News <<" + "nid=" + nid + ", heading=" + heading + ", category=" + category + ", content=" + content + ", image=" + image + ", date=" + date + ", approved=" + approved + ",slider="+slider+">>";
    }
    
    
    
    
    
}
