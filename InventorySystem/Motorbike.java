class Motorbike implements Sonda {
    private boolean abs;
    private boolean seatHeating;
    private int cost;

    public Motorbike(int cost) {
        this.cost = cost;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            this.cost += 5000;
        }
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
        if (seatHeating) {
            this.cost += 2000;
        }
    }

    @Override
    public String getOptions() {
        StringBuilder sb = new StringBuilder("Motorbike with");
        if (abs) {
            sb.append(" ABS,");
        }
        if (seatHeating) {
            sb.append(" Seat Heating,");
        }
        return sb.toString();
    }

    @Override
    public int getCost() {
        return cost;
    }
}