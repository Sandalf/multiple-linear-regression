/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.mlr;

/**
 *
 * @author luissandoval
 */
public class Dataset {

    double[][] data;

    public Dataset(double[][] _data) {
        this.data = _data;
    }

    public double[][] getData() {
        return data;
    }

    public void setData(double[][] data) {
        this.data = data;
    }
    
}
