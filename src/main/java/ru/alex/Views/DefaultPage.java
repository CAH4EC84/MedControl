package ru.alex.Views;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class DefaultPage extends VerticalLayout implements View {
    public DefaultPage() {
        addComponent(new Label("Created by cah4ec84@gmail.com"));
    }
}
