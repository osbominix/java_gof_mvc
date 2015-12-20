package com.gof.designpattern.mvc;

import com.gof.designpattern.mvc.model.Model;

/**
 * Created by yl3 on 20.12.15.
 */
public class Control {

    private Model model;
    private View view;

    public Control(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setSmartphoneType(String smartphoneType) {
        model.setSmartphoneType(smartphoneType);
    }

    public String getSmartphoneType() {
        return model.getSmartphoneType();
    }

    public void setSmartphonePrice(String smartphonePrice) {
        model.setSmartphonePrice(smartphonePrice);
    }

    public String getSmartphonePrice() {
        return model.getSmartphonePrice();
    }

    public void render() {
        view.output(getSmartphoneType(), getSmartphonePrice());
    }

}
