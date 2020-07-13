public class Printer {
    private int sheetsOfPaperLeft;
    private int toner;

    public Printer(){
        this.sheetsOfPaperLeft = 50;
//        this.toner = toner;
    }

    public int getSheetsOfPaperLeft() {
        return sheetsOfPaperLeft;
    }

    public int getToner() {
        return toner;
    }

    public void setSheetsOfPaperLeft(int sheetsOfPaperLeft) {
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }
    public boolean print(int numPages, int numCopies){
        if(this.sheetsOfPaperLeft >= 20){
            this.sheetsOfPaperLeft -= (numCopies * numPages);
        }
        return false;
    }
}
