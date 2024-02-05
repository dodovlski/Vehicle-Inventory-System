import java.util.ArrayList;
import java.util.List;

class Inventory {
    private final List<Sonda> sondas;

    public Inventory() {
        sondas = new ArrayList<>();
    }

    public void add(Sonda sonda) {
        sondas.add(sonda);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int total_price = 0;
        int car_counter = 0;
        int motorbike_counter = 0;

        for (Sonda sonda : sondas) {
            stringBuilder.append(sonda.getOptions()).append(" having a total price of ").append(sonda.getCost()).append(" TL\n");

            if (sonda instanceof Car) {
                car_counter++;
            } else if (sonda instanceof Motorbike) {
                motorbike_counter++;
            }

            total_price += sonda.getCost();
        }

        stringBuilder.append("TOTAL: ").append(sondas.size()).append(" Vehicles including ").append(car_counter)
                .append(" Cars and ").append(motorbike_counter).append(" Motorbikes having a total price of ")
                .append(total_price).append(" TL");

        return stringBuilder.toString();
    }
}











