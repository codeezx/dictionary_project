package com.example.dictionary.Models;

import java.util.List;

public class APIResponse {
    String word="";
    List<Phonetics> phonetic = null;
    List<Meanings> meanings = null;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Phonetics> getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(List<Phonetics> phonetic) {
        this.phonetic = phonetic;
    }

    public List<Meanings> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meanings> meanings) {
        this.meanings = meanings;
    }
}
