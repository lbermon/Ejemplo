/* Ejemplo - aprenderaprogramar.com */
//Esta clase representa un taxi. -- > Comentario general que puede incluir: cometido, autor, versi�n, etc�
public class Taxi { //El nombre de la clase
    private String ciudad; //Ciudad de cada objeto taxi
    private String matricula; //Matr�cula de cada objeto taxi
    private String distrito; //Distrito asignado a cada objeto taxi
    private int tipoMotor; //tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = diesel
 
    //Constructor: cuando se cree un objeto taxi se ejecutar� el c�digo que incluyamos en el constructor
    public Taxi () {
        ciudad = "M�xico D.F.";       
        matricula = "";
        distrito = "Desconocido";
        tipoMotor = 0;
    } //Cierre del constructor � el c�digo contin�a �
 
    //M�todo para establecer la matr�cula de un taxi
    public void setMatricula (String valorMatricula) {
        matricula = valorMatricula; //La matr�cula del objeto taxi adopta el valor que contenga valorMatricula
    } //Cierre del m�todo
    //M�todo para establecer el distrito de un taxi
    public void setDistrito (String valorDistrito) {
        distrito = "Distrito " + valorDistrito; //El distrito del objeto taxi adopta el valor indicado
    } //Cierre del m�todo
    public void setTipoMotor (int valorTipoMotor) {
        tipoMotor = valorTipoMotor; //El tipoMotor del objeto taxi adopta el valor que contenga valorTipoMotor
    } //Cierre del m�todo
    //M�todo para obtener la matr�cula del objeto taxi
    public String getMatricula () { return matricula; } //Cierre del m�todo
    //M�todo para obtener el distrito del objeto taxi
    public String getDistrito () { return distrito; } //Cierre del m�todo
    //M�todo para obtener el tipo de motor del objeto taxi
    public int getTipoMotor () { return tipoMotor; } //Cierre del m�todo
} //Cierre de la clase