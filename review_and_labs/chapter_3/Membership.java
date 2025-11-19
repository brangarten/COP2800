package review_and_labs.chapter_3;

public class Membership {
    String membership;
    float discount;

    public Membership(String membership, float discount) {
        this.membership = membership;
        this.discount = discount;
    }

    public String getMembership() {
        return membership;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float x) {
        this.discount = x;
    }
}