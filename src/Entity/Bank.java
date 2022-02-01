/*
debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.
 */

package Entity;


public class Bank {

    private int numBill;
    private long Dni;
    private int actualBalance;

    public Bank() {
    }

    public Bank(int numBill, long Dni, int actualBalance) {
        this.numBill = numBill;
        this.Dni = Dni;
        this.actualBalance = actualBalance;
    }

    public void setNumBill(int numBill) {
        this.numBill = numBill;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public void setActualBalance(int actualBalance) {
        this.actualBalance = actualBalance;
    }

    public int getNumBill() {
        return numBill;
    }

    public long getDni() {
        return Dni;
    }

    public int getActualBalance() {
        return actualBalance;
    }

    public String toString() {
        return "Attributes(" + "Bill number = " + numBill + ", Dni = " + Dni + ", Actual balance = " + actualBalance + ')';
    }
    
    
    
}
