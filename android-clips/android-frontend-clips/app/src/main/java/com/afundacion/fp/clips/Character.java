package com.afundacion.fp.clips;

import org.json.JSONException;
import org.json.JSONObject;

// Ejercicio 16:
public class Character {
    private String name;
    private String lastName;
    private String description;
    private String urlImage;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public Character(JSONObject json) throws JSONException {
        this.name = json.getString("name");
        this.lastName = json.getString("surname");
        this.description = json.getString("description");
        this.urlImage = json.getString("imageUrl");
    }
}
