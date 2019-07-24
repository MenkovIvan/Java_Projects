public class Cell {

    private strings value;

    public Cell(strings value){
        this.value = value;
    }

    public boolean isEmpty(){
        if (value == strings._){
            return true;
        }
        else return false;
    }

    public strings getValue() {
        return value;
    }

    public void setValue(strings name) {
        this.value = name;
    }
}
