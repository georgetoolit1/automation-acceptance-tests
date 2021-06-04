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
    int title = new Faker().number().numberBetween(1, 2);
    String email = new FakeValuesService(new Locale("en-GB"), new RandomService()).bothify("????##@gmail.com");
    List<String> dob = Arrays.asList(new SimpleDateFormat("d M yyyy").format(new Faker().date().birthday()).split("\\s"));
    String firstN = new Faker().name().firstName();
    String lastN = new Faker().name().lastName();
    String company = new Faker().company().name();
    String enterAddressLine1 = new Faker().address().buildingNumber();
    String enterAddressLine2 = new Faker().address().streetName();
    String enterCity = new Faker().address().cityName();
    int enterState = new Faker().number().numberBetween(1, 50);
    String enterMobilePhone = "07439401644";

    public DataBuilder build() {
        return this;
    }
}