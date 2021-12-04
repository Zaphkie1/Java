package Metodos;
/*
Ej11:simula el juego de piedra papel o tijeras
mediante el uso de numeros aleatorios (Random)
*/
public class PiedraPapelTijera {
    public static void main(String[] args) {
        //Declaracion de variables
        int mano;
        System.out.println("-------------------------------------");
        System.out.println("\tPiedra, papel o tijera");
        System.out.println("-------------------------------------");
        mano =((int)(Math.random()*3));
        switch(mano){
            case 0:{
                System.out.println("Piedra");
            }
            break;
            case 1:{
                System.out.println("Papel");
            }
            break;
            case 2:{
                System.out.println("Tijera");
            }
            break;
        }//Fin del whitch
    }
}
