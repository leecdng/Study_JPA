package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;

    /**
     * 상품 수정 (name, price, stockQuantity)
     */
    public void change(String name, int price, int stockQuantity){
        super.setName(name);
        super.setPrice(price);
        super.setStockQuantity(stockQuantity);
    }
}
