package ru.russianroadman.wingman.data;

public enum TagType {

    OTHER("OTHER"),
    QUESTION("QUESTION"),
    BUG("BUG"),
    SUGGESTION("SUGGESTION");

    private final String title;

    TagType(String title){
        this.title = title;
    }

    public String getTitle(){ return this.title; }

}
