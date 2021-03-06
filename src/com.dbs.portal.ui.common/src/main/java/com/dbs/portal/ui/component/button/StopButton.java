package com.dbs.portal.ui.component.button;

import com.dbs.portal.ui.util.LanguageSwitcher;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.Runo;

public class StopButton extends Button {
    
    /**
     * Creates a new push button. The value of the push button is false and it
     * is immediate by default.
     * 
     */
    public StopButton() {
    	super();
    	this.addStyleName("dbsButton");
    }

    /**
     * Creates a new push button.
     * 
     * The value of the push button is false and it is immediate by default.
     * 
     * @param caption
     *            the Button caption.
     */
    public StopButton(String caption) {
        super();
        setCaption(caption);
        createStyle();
    }

    /**
     * Creates a new push button with click listener.
     * 
     * @param caption
     *            the Button caption.
     * @param listener
     *            the Button click listener.
     */
    public StopButton(String caption, ClickListener listener) {
    	this(caption);
        addListener(listener);
        createStyle();
    }

    /**
     * Creates a new push button with a method listening button clicks. Using
     * this method is discouraged because it cannot be checked during
     * compilation. Use
     * {@link #Button(String, com.vaadin.ui.Button.ClickListener)} instead. The
     * method must have either no parameters, or only one parameter of
     * Button.ClickEvent type.
     * 
     * @param caption
     *            the Button caption.
     * @param target
     *            the Object having the method for listening button clicks.
     * @param methodName
     *            the name of the method in target object, that receives button
     *            click events.
     */
    public StopButton(String caption, Object target, String methodName) {
        this(caption);
        addListener(ClickEvent.class, target, methodName);
        createStyle();
    }
	
    protected void createStyle(){
//    	this.addStyleName("stopButton");
//    	this.addStyleName(Runo.BUTTON_SMALL);
    	this.addStyleName("dbsButton");
    }

}
