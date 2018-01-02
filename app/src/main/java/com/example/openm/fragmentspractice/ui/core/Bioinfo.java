package com.example.openm.fragmentspractice.ui.core;

import java.io.Serializable;

/**
 * Created by openm on 02-Jan-18.
 */

public class Bioinfo implements Serializable {
    String name, email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Bioinfo(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
