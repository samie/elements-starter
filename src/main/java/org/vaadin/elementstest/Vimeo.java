/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vaadin.elementstest;

import com.vaadin.ui.CssLayout;
import org.vaadin.elements.Element;
import org.vaadin.elements.ElementIntegration;
import org.vaadin.elements.Elements;
import org.vaadin.elements.Import;
import org.vaadin.elements.Root;
import org.vaadin.elements.Tag;

/**
 * Vimeo component based on vimeo-player from customelements.io.
 *
 * More info at:
 * http://kappuccino.github.io/vimeo-player/bower_components/vimeo-player/
 *
 * @author Sami Ekblad
 */
public class Vimeo extends CssLayout {

    public Vimeo(String videoId, boolean autoPlay) {
        Root root = ElementIntegration.getRoot(this);
        root.appendChild(VimeoElement.create(videoId, autoPlay));
    }

    /**
     * Java API using Vaadin Elements API.
     *
     * Note that this requires the Bower component installation in
     * webapp/VAADIN.
     *
     */
    @Tag("vimeo-player")
    @Import("VAADIN/bower_components/vimeo-player/vimeo-player.html")
    public interface VimeoElement extends Element {

        public static VimeoElement create() {
            return Elements.create(VimeoElement.class);
        }

        public static VimeoElement create(String videoId, boolean autoPlay) {
            VimeoElement v = create();
            v.setAttribute("videoid", videoId);
            v.setAttribute("autoplay", autoPlay ? "1" : "0");
            return v;
        }
    }
}
