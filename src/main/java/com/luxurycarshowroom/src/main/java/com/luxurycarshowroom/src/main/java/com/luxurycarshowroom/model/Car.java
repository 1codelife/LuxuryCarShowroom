
package com.luxurycarshowroom.model;

import javafx.beans.property.*;

public class Car {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty make = new SimpleStringProperty();
    private final StringProperty model = new SimpleStringProperty();
    private final ObjectProperty<CarCategory> category = new SimpleObjectProperty<>();
    private final DoubleProperty price = new SimpleDoubleProperty();
    private final IntegerProperty horsepower = new SimpleIntegerProperty();
    private final StringProperty imagePath = new SimpleStringProperty();
    private final StringProperty soundPath = new SimpleStringProperty();
    private final StringProperty specs = new SimpleStringProperty();

    public Car() {
        this.id.set(UUID.randomUUID().toString());
    }

    public Car(String make, String model, CarCategory category, double price, 
              int horsepower, String imagePath, String soundPath, String specs) {
        this();
        this.make.set(make);
        this.model.set(model);
        this.category.set(category);
        this.price.set(price);
        this.horsepower.set(horsepower);
        this.imagePath.set(imagePath);
        this.soundPath.set(soundPath);
        this.specs.set(specs);
    }

    // ID property
    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    // Make property
    public String getMake() {
        return make.get();
    }

    public StringProperty makeProperty() {
        return make;
    }

    public void setMake(String make) {
        this.make.set(make);
    }

    // Model property
    public String getModel() {
        return model.get();
    }

    public StringProperty modelProperty() {
        return model;
    }

    public void setModel(String model) {
        this.model.set(model);
    }

    // Category property
    public CarCategory getCategory() {
        return category.get();
    }

    public ObjectProperty<CarCategory> categoryProperty() {
        return category;
    }

    public void setCategory(CarCategory category) {
        this.category.set(category);
    }

    // Price property
    public double getPrice() {
        return price.get();
    }

    public DoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    // Horsepower property
    public int getHorsepower() {
        return horsepower.get();
    }

    public IntegerProperty horsepowerProperty() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower.set(horsepower);
    }

    // ImagePath property
    public String getImagePath() {
        return imagePath.get();
    }

    public StringProperty imagePathProperty() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath.set(imagePath);
    }

    // SoundPath property
    public String getSoundPath() {
        return soundPath.get();
    }

    public StringProperty soundPathProperty() {
        return soundPath;
    }

    public void setSoundPath(String soundPath) {
        this.soundPath.set(soundPath);
    }

    // Specs property
    public String getSpecs() {
        return specs.get();
    }

    public StringProperty specsProperty() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs.set(specs);
    }

    @Override
    public String toString() {
        return make.get() + " " + model.get();
    }
}
