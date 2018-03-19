package ru.alex;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.hibernate.Session;
import ru.alex.Utils.HibernateSessionfactory;
import ru.alex.Views.DefaultPage;
import ru.alex.Views.FirmsPage;
import ru.alex.Views.ReportPage;
import ru.alex.Views.SubscriptionPage;

import java.util.List;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Session session = HibernateSessionfactory.getSession();
        VerticalLayout screen = new VerticalLayout();
        VerticalLayout views = new VerticalLayout();

        //��������� ��� ��������� �������������
        Navigator navigator= new Navigator(this,views);
        navigator.addView("",new DefaultPage());
        navigator.addView("subs",new SubscriptionPage(session));
        navigator.addView("firms",new FirmsPage());
        navigator.addView("reports",new ReportPage());

        //���� ��� ��������� �� ��������������
        MenuBar menu = new MenuBar();
        MenuBar.MenuItem homeMenu = menu.addItem("", VaadinIcons.HOME,Hclick->navigator.navigateTo(""));
        MenuBar.MenuItem subsMenu = menu.addItem("subs", VaadinIcons.HOME,Sclick->navigator.navigateTo("subs"));
        MenuBar.MenuItem firmMenu = menu.addItem("firms", VaadinIcons.HOME,Fclick->navigator.navigateTo("firms"));
        MenuBar.MenuItem reportMenu = menu.addItem("reports", VaadinIcons.HOME,Rclick->navigator.navigateTo("reports"));

        views.setSpacing(false);
        views.setMargin(false);
        screen.addComponents(menu,views);
        setContent(screen);



    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
