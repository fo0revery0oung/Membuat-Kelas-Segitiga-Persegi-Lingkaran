class Lingkaran {
    private double r;

    public Lingkaran (){}

    public Lingkaran (double r){
        this.r = r;
    }

    public double getLuas () {
        return Math.PI * r * r;
    }

    public double getKeliling () {
        return 2* Math.PI * r;
    }

    public double getJari () {
        return r;
    }

    public void setJari (double r){
        this.r = r;
    }
}
