package com.utest.certification.testing.task;

import com.utest.certification.testing.userinterface.CreateSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class UtestCreateSection implements Task{
    private String firstName;
    private String lastName;
    private String email;
    private String monthBirth;
    private String dayBirth;
    private String yearBirth;
    private String city;
    private String zip;
    private String country;
    private String computer;
    private String osVersion;
    private String osLanguage;
    private String password;

    public UtestCreateSection(String firstName, String lastName, String email, String monthBirth, String dayBirth, String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.password = password;
    }

    public static UtestCreateSection fillform(String firstName, String lastName, String email, String monthBirth, String dayBirth,
                                              String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        return Tasks.instrumented(UtestCreateSection.class,  firstName,  lastName,  email,  monthBirth,  dayBirth,  yearBirth,  city,  zip,  country,  computer,  osVersion,  osLanguage,  password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreateSection.JOIN_BUTTON),
                Enter.theValue(firstName).into(CreateSection.FIRSTNAME_INPUT),
                Enter.theValue(lastName).into(CreateSection.LASTNAME_INPUT),
                Enter.theValue(email).into(CreateSection.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(monthBirth).from(CreateSection.MONTH_SELECT),
                SelectFromOptions.byVisibleText(dayBirth).from(CreateSection.DAY_SELECT),
                SelectFromOptions.byVisibleText(yearBirth).from(CreateSection.YEAR_SELECT),
                Click.on(CreateSection.LOCATION_BUTTON),
                Enter.theValue(city).into(CreateSection.CITY_INPUT),
                Enter.theValue(zip).into(CreateSection.ZIP_INPUT),
                Click.on(CreateSection.COUNTRY_SELECT),
                Enter.theValue(country).into(CreateSection.COUNTRY_INPUT),
                Click.on(CreateSection.DIVICES_BUTTON),
                Click.on(CreateSection.COMPUTER_SELECT),
                Enter.theValue(computer).into(CreateSection.COMPUTER_INPUT),
                Click.on(CreateSection.VERSION_SELECT),
                Enter.theValue(osVersion).into(CreateSection.VERSION_INPUT),
                Click.on(CreateSection.LANGUAGE_SELECT),
                Enter.theValue(osLanguage).into(CreateSection.LANGUAGE_INPUT),
                Click.on(CreateSection.LASTSTEP_BUTTON),
                Enter.theValue(password).into(CreateSection.PASSWORD_INPUT),
                Enter.theValue(password).into(CreateSection.PASSWORD_CONFIRM_INPUT),
                Click.on(CreateSection.TERM_OF_USE_INPUT),
                Click.on(CreateSection.PRIVACY_INPUT));
    }
}
