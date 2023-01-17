package org.sp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PictureContent {
    @Id
    @GeneratedValue
    private int id;
}
