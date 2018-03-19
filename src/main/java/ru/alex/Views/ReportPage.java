package ru.alex.Views;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ReportPage extends VerticalLayout implements View {
    public ReportPage() {
        addComponent(new Label("Report Page"));
    }
}
