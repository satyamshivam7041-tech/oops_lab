import java.util.*;


class ComplexNum<T extends Number> {
    double r; // real part
    double i; // imaginary part

    
    ComplexNum(T r, T i) {
        this.r = r.doubleValue();
        this.i = i.doubleValue();
    }

        public ComplexNum<Double> add(ComplexNum<?> other) {
        double real = this.r + other.r;
        double imag = this.i + other.i;
        return new ComplexNum<Double>(real, imag);
    }

   
    public String toString() {
        return r + " + " + i + "i";
    }
}


class FClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        double d1, d2;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);

        ComplexNum<Double> c3 = c1.add(c2);

        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}