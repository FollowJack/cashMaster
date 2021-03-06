package model.dtos;

import model.entities.Category;

/**
 * Created by Deniel on 21.01.2015.
 */
public class CategoryDto {

    private long id;
    private String name;

    public CategoryDto() {

    }

    public CategoryDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDto(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public void updateSource(Category entity) {
        entity.setName(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
