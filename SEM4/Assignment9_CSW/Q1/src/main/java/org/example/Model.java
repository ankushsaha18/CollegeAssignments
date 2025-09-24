package org.example;

public class Model {
    private int modelNo;
    private int noCylinders;

    public Model(int modelNo, int noCylinders) {
        this.modelNo = modelNo;
        this.noCylinders = noCylinders;
    }

    public int getModelNo() {
        return modelNo;
    }
    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getNoCylinders() {
        return noCylinders;
    }
    public void setNoCylinders(int noCylinders) {
        this.noCylinders = noCylinders;
    }
}
