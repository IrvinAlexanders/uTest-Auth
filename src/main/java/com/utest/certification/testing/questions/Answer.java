package com.utest.certification.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import com.utest.certification.testing.userinterface.CreateSection;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameQuestion = String.valueOf(Text.of(CreateSection.COMPLETE_SETUP_BUTTON));
        if (question.equals(nameQuestion)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}