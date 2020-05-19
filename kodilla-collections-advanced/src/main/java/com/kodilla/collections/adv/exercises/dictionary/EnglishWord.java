package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnglishWord)) return false;
        EnglishWord that = (EnglishWord) o;
        return getPartOfSpeech() == that.getPartOfSpeech() &&
                Objects.equals(getWord(), that.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPartOfSpeech(), getWord());
    }
}
