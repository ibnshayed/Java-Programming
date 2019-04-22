package bd.ac.seu.vaadintest;

import com.vaadin.flow.component.UI;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.spring.annotation.EnableVaadin;

import java.awt.*;

@EnableVaadin
public class IndexUI extends UI {

    TextField textField = new TextField();
    Label greeting = new Label("Hello stranger");

textField.addValueChangeListener(event ->
            greeting.setText("Hello "+event.getValue()));

    VerticalLayout layout = new VerticalLayout(textField, greeting);
}
