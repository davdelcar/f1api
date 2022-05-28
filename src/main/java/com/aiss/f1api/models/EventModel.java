package com.aiss.f1api.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class EventModel {

private String id;
private String name;
private String description;
private String organizer;
private String category;
private String location;
private String date;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public EventModel withId(String id) {
this.id = id;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public EventModel withName(String name) {
this.name = name;
return this;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public EventModel withDescription(String description) {
this.description = description;
return this;
}

public String getOrganizer() {
return organizer;
}

public void setOrganizer(String organizer) {
this.organizer = organizer;
}

public EventModel withOrganizer(String organizer) {
this.organizer = organizer;
return this;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public EventModel withCategory(String category) {
this.category = category;
return this;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public EventModel withLocation(String location) {
this.location = location;
return this;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public EventModel withDate(String date) {
this.date = date;
return this;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public EventModel withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}