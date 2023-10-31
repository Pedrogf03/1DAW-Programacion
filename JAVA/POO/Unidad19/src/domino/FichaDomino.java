package domino;

public class FichaDomino implements Volteable, Encajable {

    private int cara1;
    private int cara2;

    public FichaDomino(int cara1, int cara2){
        this.cara1 = cara1;
        this.cara2 = cara2;
    }

    public int getCara1() {
        return cara1;
    }
    public void setCara1(int cara1) {
        this.cara1 = cara1;
    }

    public int getCara2() {
        return cara2;
    }
    public void setCara2(int cara2) {
        this.cara2 = cara2;
    }

    public FichaDomino voltea(){

        int aux = this.getCara2();
        this.setCara2(this.getCara1());
        this.setCara1(aux);

        return this;

    }

    public boolean encaja(FichaDomino f){

        return (this.getCara1() == f.getCara1()) || (this.getCara1() == f.getCara2()) || (this.getCara2() == f.getCara1()) || (this.getCara2() == f.getCara2());

    }

    @Override
    public String toString(){

        String num1;
        String num2;

        if(cara1 == 0){
            num1 = " ";
        } else {
            num1 = ""+cara1;
        }
        if(cara2 == 0){
            num2 = " ";
        } else {
            num2 = ""+cara2;
        }

        return "["+ num1 +"|"+ num2 +"]";

    }

}
