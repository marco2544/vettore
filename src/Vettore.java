import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Vettore {
    private int nel;
    private double values[];

    public Vettore(int nel) {
        this.nel = nel;
        this.values = new double[nel];
    }
    public Vettore farePerTutti(UnaryOperator<Double> op){
        for (int i = 0; i < nel; i++) {
            this.values[i] = op.apply(values[i]);
        }
        return this;
    }

    public  Vettore zeros(){
        return farePerTutti((v)->0.);
    }

    public Vettore ones(){
        return farePerTutti((v)->1.);
    }

    public Vettore add(double a){
        return farePerTutti((v)->v+a);
    }

    @Override
    public String toString() {
        return null;
    }
}
