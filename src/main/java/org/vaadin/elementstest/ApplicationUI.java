package org.vaadin.elementstest;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

/**  Simple Web Components starter for Vaadin.
 * 
 * @author Sami Ekblad
 */
@Theme("valo")
@SuppressWarnings("serial")
public class ApplicationUI extends UI {

    @WebServlet(value = {"/*"}, asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = ApplicationUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        Vimeo vimeo = new Vimeo("32001208", true);
        vimeo.setSizeFull();
        setContent(vimeo);

    }

}
