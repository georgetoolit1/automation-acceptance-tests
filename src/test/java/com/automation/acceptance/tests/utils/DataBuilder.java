package com.automation.acceptance.tests.utils;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Data
public class DataBuilder {
    private int title = new Faker().number().numberBetween(1, 2);
    private String email = new FakeValuesService(new Locale("en-GB"), new RandomService()).bothify("????##@gmail.com");
    private List<String> dob = Arrays.asList(new SimpleDateFormat("d M yyyy").format(new Faker().date().birthday()).split("\\s"));
    private String firstN = new Faker().name().firstName();
    private String lastN = new Faker().name().lastName();
    private String company = new Faker().company().name();
    private String enterAddressLine1 = new Faker().address().buildingNumber();
    private String enterAddressLine2 = new Faker().address().streetName();
    private String enterCity = new Faker().address().cityName();
    private int enterState = new Faker().number().numberBetween(1, 50);
    private String enterMobilePhone = "074" + new Faker().phoneNumber().subscriberNumber(9);

    public DataBuilder build() {
        return this;
    }
}