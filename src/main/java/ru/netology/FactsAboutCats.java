package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

//Этот класс будет преобразовывать json в java
public class FactsAboutCats {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public FactsAboutCats(
            // Аннотации @JsonProperty нужны чтобы конструктор понимал, какие поля в json соотносяться с полями в java классе
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "FactsAboutCats" +
                "\n id='" + id +
                "\n text='" + text +
                "\n type='" + type +
                "\n user='" + user +
                "\n upvotes=" + upvotes;

    }
}

