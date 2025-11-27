package kr.persnol.color.PC;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private int id;               // 질문 번호
    private String text;          // 질문 내용
    private List<Option> options; // 보기 목록

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
        this.options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<Option> getOptions() {
        return options;
    }
}