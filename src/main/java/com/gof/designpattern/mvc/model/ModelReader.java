package com.gof.designpattern.mvc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yl3 on 20.12.15.
 */
public class ModelReader {

    Set<Model> modelSet = new HashSet<Model>();

    public Set<Model> generateModels() {
        Model iphone6Model = new Model();
        iphone6Model.setSmartphoneType("IPhone 6");
        iphone6Model.setSmartphonePrice("800 Euro");

        Model samsungs6Model = new Model();
        samsungs6Model.setSmartphoneType("Samsung S6");
        samsungs6Model.setSmartphonePrice("500Euro");

        modelSet.add(iphone6Model);
        modelSet.add(samsungs6Model);

        return modelSet;
    }
}
