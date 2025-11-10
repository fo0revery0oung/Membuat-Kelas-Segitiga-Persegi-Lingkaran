class Persegi {
    private double s;

    public double getLuas (){
        double luas = s*s;
        return luas;
    }

    public double getKeliling (){
        return 4*s;
    }

    public double getSisi (){
        return s;
    }

    public void setSisi (double s){
        this.s = s;
    }


}
