package com.gof.designpattern;

import com.gof.designpattern.mvc.Control;
import com.gof.designpattern.mvc.View;
import com.gof.designpattern.mvc.model.Model;
import com.gof.designpattern.mvc.model.ModelReader;

import java.util.Set;

/**
 * Created by yl3 on 20.12.15.
 */
public class CommandCenter {
    private static View view = new View();

    public static void main(String[] args) {
        ModelReader modelReader = new ModelReader();
        Set<Model> models = modelReader.generateModels();

        for(Model model: models) {
            Control control = new Control(model, view);
            control.render();
        }
    }
}
