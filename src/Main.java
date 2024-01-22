import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Relação de carros");
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol ", 14.4);
            put("Uno ", 15.6);
            put("Mobi ", 16.1);
            put("Hb20 ", 14.5);
            put("Kwid ", 15.9);
        }};

        System.out.println(carros);

        carros.put("Gol ",15.2);
        System.out.println(carros);

        System.out.println("Verifique se tucson ta na relação: "+carros.containsKey("tucson"));

        System.out.println("exiba o consumo do uno "+ carros.get("Uno ") );

        System.out.println("Exiba os modelos: "+ carros.keySet());

        System.out.println("exiba o consumo do carros: "+ carros.values());

        System.out.println("Exiba o modelo mais eficiente :");
        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente ="";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: "+modeloMaisEficiente+" - "+ consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo com menos consumo: ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: "+ modeloMenosEficiente +" - "+ consumoMenosEficiente);
            }

        }


        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("exiba a soma dos consumos: "+ soma);
        System.out.println("Exiba a media dos consumos: "+(soma/carros.size()));

        System.out.println("remova os modelos com consumo igual a 15,6: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println(carros.toString());

        System.out.println("exiba em ordem de inserção");

        Map<String, Double> carros1 = new LinkedHashMap<>(){{
            put("Gol ", 14.4);
            put("Uno ", 15.6);
            put("Mobi ", 16.1);
            put("Hb20 ", 14.5);
            put("Kwid ", 15.9);
        }};

        System.out.println(carros1);


        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println("exiba em ordem alfabetica");

        System.out.println(carros2.toString());

        System.out.println("Apague a lista");
        carros.clear();
        System.out.println(carros);

        System.out.println("Verirfique se está vazia: ");
        System.out.println(carros.isEmpty());

    }
}