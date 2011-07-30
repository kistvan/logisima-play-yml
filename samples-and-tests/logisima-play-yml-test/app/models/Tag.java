package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Tag extends Model {

    public String name;

    public int compareTo(Tag tag) {
        final int NOT_EQUAL = -1;
        final int EQUAL = 0;

        if (!this.name.equals(tag.name)) {
            return NOT_EQUAL;
        }
        return EQUAL;
    }

}