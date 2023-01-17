package org.sp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PictureContent {
    @Id
    @GeneratedValue
    private int id;
}
