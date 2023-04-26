package co.edu.unac.poo1.cafeteria.unidad2;


import co.edu.unac.poo1.cafeteria.unidad2.caferiaroy.Cafe;

import java.util.*;

public class Unidad2 {


    //Cree un método que reciba un ArrayList de café y
    // calcule la media de sizeBean e imprima ese valor en la pantalla.
    public static void calcularMedida(){
        ArrayList<Cafe> cafes = new ArrayList<>();
        Cafe cafe1 = new Cafe(11,"Colombia",15,300);
        Cafe cafe2 = new Cafe(22,"Colombia",12,300);
        Cafe cafe3 = new Cafe(33,"Colombia",5,200);
        Cafe cafe4 = new Cafe(44,"Colombia",10,300);
        cafes.add(cafe1);
        cafes.add(cafe2);
        cafes.add(cafe3);
        cafes.add(cafe4);

        //funcion para calcular el tamaño del cafe
        double tamahoBean = calcularSise(cafes);
        System.out.println("Tamaño del sizeBean "+ tamahoBean);

    }

        //funcion para calcular el tamaño del cafe
    private static double calcularSise(ArrayList<Cafe> cafes){
        int totalSisebean = 0;
        for (Cafe cafe: cafes){
            totalSisebean += cafe.getTamahoBean();
        }
        double tamahoBean = (double) totalSisebean / cafes.size();
        return tamahoBean;
    }

    //Cree un método con 5 instancias de Coffee y 2 instancias nulas,
    // agréguelo a una LinkedList e imprima la lista en la pantalla
    public static void linkdList(){
        LinkedList<Cafe> cafes = new LinkedList<>();
        Cafe cafe1 = new Cafe(1,"Castilla",12,250);
        Cafe cafe2 = new Cafe(2,"Colombia",10,350);
        Cafe cafe3 = new Cafe(3,"Castilla",12,250);
        Cafe cafe4 = new Cafe(4,"Colombia",10,350);
        Cafe cafe5 = new Cafe(5,"Castilla",12,250);
        Cafe cafe6 = null;
        Cafe cafe7 = null;
        //Añado los objetos a mi lista
        cafes.add(cafe1);
        cafes.add(cafe2);
        cafes.add(cafe3);
        cafes.add(cafe4);
        cafes.add(cafe5);
        cafes.add(cafe6);
        cafes.add(cafe7);

        //Recorro los elementos de mi lista
        System.out.println("Lista de café");
        for (int i = 0; i < cafes.size(); i++) {
            Cafe cafe = cafes.get(i);
            if (cafe != null){
                System.out.println("Café " + (i + 1)+ ": " + cafe.getVariedad()
                + " - " + cafe.getTamahoBean());
            }else {
                System.out.println("Café " + (i + 1) + ": NULL");
            }
        }
    }

    //Cree un método con 5 instancias de Coffee y 2 instancias nulas,
    // agréguelo a una ArrayList e imprima la lista en la pantalla.
    public static void cafeArrayList() {
        ArrayList<Cafe> cafes2 = new ArrayList<>();
        Cafe cafe1 = new Cafe(11,"Colombia",15,300);
        Cafe cafe2 = new Cafe(22,"Catimoro",12,300);
        Cafe cafe3 = new Cafe(33,"Castilla",5,200);
        Cafe cafe4 = new Cafe(44,"Colombia",10,300);
        Cafe cafe5 = null;
        Cafe cafe6 = null;
        //Añado los objetos a mi lista
        cafes2.add(cafe1);
        cafes2.add(cafe2);
        cafes2.add(cafe3);
        cafes2.add(cafe4);
        cafes2.add(cafe5);
        cafes2.add(cafe6);

        //recorro la lista con for
        System.out.println("Lista de café arraylist");
        for (int i = 0; i < cafes2.size(); i++) {
            Cafe cafe = cafes2.get(i);
            if (cafe != null){
                System.out.println("Café " + (i + 1)+ ": " + cafe.getVariedad()
                        + " - " + cafe.getTamahoBean());
            }else {
                System.out.println("Café " + (i + 1) + ": NULL");
            }

        }

    }

    //Cree un método en el que ordene 6 instancias de café ascendentes por peso e imprima la lista. Junto a eso,
    // retire el peso más pesado de la lista e imprima la lista nuevamente.
    public static void listaCafeOrdenada(){
        ArrayList<Cafe> listaCafe = new ArrayList<>();
        Cafe cafe1 = new Cafe(1,"Castilla",20,320);
        Cafe cafe2 = new Cafe(1,"Colombia",10,520);
        Cafe cafe3 = new Cafe(1,"Castilla",15,220);
        Cafe cafe4 = new Cafe(1,"Catimoro",12,120);
        Cafe cafe5 = new Cafe(1,"Castilla",11,820);
        //añado los elementos a mi lista
        listaCafe.add(cafe1);
        listaCafe.add(cafe2);
        listaCafe.add(cafe3);
        listaCafe.add(cafe4);
        listaCafe.add(cafe5);

        //ordeno la lista de de forma ascedente

        Collections.sort(listaCafe,Comparator.comparing(Cafe::getPeso));

        //Imprimo mi lista ordenada
        System.out.println("########################");
        System.out.println("Lista ordenada ");
        for (Cafe cafe : listaCafe){
            System.out.println(cafe.getVariedad() + " - " + cafe.getPeso() + " gramos");
        }
        //remuevo el café mas pesado de la lista
        Cafe cafeMasPesado = listaCafe.remove(listaCafe.size() -1 );
        //Lista sin el café mas pesado
        System.out.println("##########################");
        System.out.println("Lista sin el café más pesado ");
        for (Cafe cafe: listaCafe){
            System.out.println(cafe.getVariedad()+ " - "+ cafe.getPeso() + " gramos");
        }
    }

    //Cree un método en el que ordene 5 instancias de Coffee descendentes
    // por sizeBean y, junto a eso, solicite una nueva instancia al usuario,
    // después de eso, agregue esa última instancia a la lista,
    // imprima la lista. Junto a eso, retire el Café con el tamaño más grande
    // del grano e imprima la lista nuevamente.

    public static void ordenDescendenteCafe(){
        ArrayList<Cafe> listaCafeDes = new ArrayList<>();
        Cafe cafeq1 = new Cafe(119,"Colombia",15,260);
        Cafe cafeq2 = new Cafe(118,"Castilla",16,160);
        Cafe cafeq3 = new Cafe(117,"Catimoro",19,660);
        Cafe cafeq4 = new Cafe(116,"Catimoro",20,260);
        Cafe cafeq5 = new Cafe(115,"Colombia",10,360);

        listaCafeDes.add(cafeq1);
        listaCafeDes.add(cafeq2);
        listaCafeDes.add(cafeq3);
        listaCafeDes.add(cafeq4);
        listaCafeDes.add(cafeq5);

        Collections.sort(listaCafeDes, Comparator.comparing(Cafe::getTamahoBean).reversed());

        for(Cafe cafe: listaCafeDes){
            System.out.println("Orden cafe por sizeBean " + cafe.getTamahoBean());
        }

        System.out.println("-->-->-->-->--> <--<--<--<--<--");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los detalles de la nueva instancia del café " +
                "separados por coma (Id, Variedad, tamaño, peso): ");
        String input = entrada.nextLine();
        String []inputs = input.split(",");
        int newId = Integer.parseInt(inputs[0].trim());
        String newVariedad = inputs[1].trim();
        int newTamaho = Integer.parseInt(inputs[2].trim());
        double newPeso = Double.parseDouble(inputs[3].trim());
        Cafe newCafe = new Cafe(newId,newVariedad,newTamaho,newPeso);
        //Añado la nueva instancia a la lista
        listaCafeDes.add(newCafe);

        System.out.println("Lista Actualizada");
        for (Cafe cafe: listaCafeDes){
            System.out.println(cafe.toString());
        }

        System.out.println();
        //Remuevo el café con el tamaño mas grande
        Cafe cafeGrande = Collections.max(listaCafeDes, Comparator.comparing(Cafe::getTamahoBean));
        listaCafeDes.remove(cafeGrande);
        for (Cafe cafe2 : listaCafeDes){
            System.out.println("Lista Actualizada sin el café mas grande : " + cafe2.getVariedad() + " - " + cafe2.getTamahoBean() + " cms");
        }


    }


    //Cree un método que reciba dos listas de Café y devuelva ambas listas fusionadas
    // en una nueva lista única ordenada por variedad, agregue otro método para imprimir esa
    // lista en pantalla mostrando cada Café así:<id> => Tamaño del grano: <tamaño>, Peso: <peso>, Variedad:
    //<variedad>
    public static void Fusionar2listas(){
        ArrayList<Cafe> listaCafe1 = new ArrayList<>();
        Cafe cafe1 = new Cafe(145,"Castilla",20,320);
        Cafe cafe2 = new Cafe(1443,"Colombia",10,520);
        Cafe cafe3 = new Cafe(45431,"Castilla",15,220);
        Cafe cafe4 = new Cafe(14534,"Catimoro",12,120);
        Cafe cafe5 = new Cafe(4534531,"Castilla",11,820);
        //añado los elementos a mi lista
        listaCafe1.add(cafe1);
        listaCafe1.add(cafe2);
        listaCafe1.add(cafe3);
        listaCafe1.add(cafe4);
        listaCafe1.add(cafe5);

        ArrayList<Cafe> listacafe2 = new ArrayList<>();
        Cafe cafe11 = new Cafe(11,"Colombia",15,300);
        Cafe cafe22 = new Cafe(22,"Catimoro",12,300);
        Cafe cafe33 = new Cafe(33,"Castilla",5,200);
        Cafe cafe44 = new Cafe(44,"Colombia",10,300);
        //Añado los objetos a mi lista
        listacafe2.add(cafe11);
        listacafe2.add(cafe22);
        listacafe2.add(cafe33);
        listacafe2.add(cafe44);

        //Añado los datos de la lista en una sola
        ArrayList<Cafe> listaFusionada = new ArrayList<>(listaCafe1);
        listaFusionada.addAll(listacafe2);

        //ordeno la lista por variedad
        Collections.sort(listaFusionada, Comparator.comparing(Cafe::getVariedad));

        //Recorro la lista con todos los datos ya fusionados
        System.out.println("Lista fusionada ");
        for (Cafe cafe : listaFusionada){

            System.out.println(" id "+ cafe.getId() + " tamaño " + cafe.getTamahoBean()
            + " peso: "+ cafe.getPeso() + " variedad "+ cafe.getVariedad());
        }
    }




}
