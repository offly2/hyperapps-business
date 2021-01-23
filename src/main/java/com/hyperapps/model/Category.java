package com.hyperapps.model;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@ToString
public class Category {

	    public int id;
	    public String name;
	    public String image_path;
	    public int active;
	    public int category_status;
	    public boolean isSelected;
}
