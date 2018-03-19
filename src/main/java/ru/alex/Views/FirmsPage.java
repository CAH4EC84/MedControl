package ru.alex.Views;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class FirmsPage extends VerticalLayout implements View {
    public FirmsPage() {
        addComponent(new Label("Firms Page"));
    }
}
