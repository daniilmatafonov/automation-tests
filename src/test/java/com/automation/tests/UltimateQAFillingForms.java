package com.automation.tests;

import org.junit.Test;
import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class UltimateQAFillingForms {

    public static final String SITE_URL = "https://www.ultimateqa.com";

    @Test
    public void fillFirstFormCorrectly(){
        open(SITE_URL + "/filling-out-forms");
        $(By.id("et_pb_contact_name_0")).val("User");
        $(By.cssSelector("#et_pb_contact_message_0")).val("Hello");
        $(By.cssSelector("#et_pb_contact_form_0 > div.et_pb_contact > form > div > button")).submit();
        $$(By.cssSelector("#et_pb_contact_form_0 > div > p")).shouldHave(CollectionCondition.texts(("Form filled out successfully")));

    }


}
