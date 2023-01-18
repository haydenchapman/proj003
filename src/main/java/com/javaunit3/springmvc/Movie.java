package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface Movie {

    String getTitle();

    String getMaturityRating();

    String getGenre();
}
