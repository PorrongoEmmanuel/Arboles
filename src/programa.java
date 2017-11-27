import javax.print.DocFlavor;

public class programa {
    public static void main(String[]args){
        ArbolAVL ARBOLITOAVL= new ArbolAVL();
        //insertando nodos
        ARBOLITOAVL.insertar(10);
        ARBOLITOAVL.insertar(5);
        ARBOLITOAVL.insertar(13);
        ARBOLITOAVL.insertar(1);
        ARBOLITOAVL.insertar(6);
        ARBOLITOAVL.insertar(17);
        ARBOLITOAVL.insertar(16);


        ARBOLITOAVL.preorden(ARBOLITOAVL.obtenerRaiz());
    }
}
