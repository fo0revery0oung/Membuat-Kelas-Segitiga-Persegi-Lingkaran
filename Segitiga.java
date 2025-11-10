class Segitiga {
    private double a;
    private double t;

    public Segitiga () {
    }

    public Segitiga (double a, double t){
        this.a = a;
        this.t = t;
    }
    public void setAlas(double a){
        this.a = a;
    }

    public void setTinggi(double t){
        this.t = t;
    }

    public double getAlas (){
        return a;
    }

    public double getTinggi (){
        return t;
    }
    public double getLuas (){
        return 0.5 * a * t;
    }

    public double getKeliling (){
        double s = Math.sqrt((a*a) + (t*t));
        return s + a + t;
    }
}
