class Car implements Sonda {

    private boolean abs;
    private boolean musicSystem;
    private boolean airBag;
    private boolean sunRoof;
    private int cost;
    private int production = 2023;

    public Car(int cost) {
        this.cost = cost;
    }
    public int getProduction(){
        this.production = production;
        return production;

    }



    public void setAbs(boolean abs) {
        this.abs = abs;
        if (abs) {
            this.cost += 5000;
        }
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
        if (musicSystem) {
            this.cost += 1000;
        }
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
        if (airBag) {
            this.cost += 3000;
        }
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
        if (sunRoof) {
            this.cost += 2000;
        }
    }

    @Override
    public String getOptions() {
        StringBuilder stringBuilder = new StringBuilder("Car with "+ getProduction());
        if (abs) {
            stringBuilder.append(" ABS,");
        }
        if (musicSystem) {
            stringBuilder.append(" Music System,");
        }
        if (airBag) {
            stringBuilder.append(" Air Bag,");
        }
        if (sunRoof) {
            stringBuilder.append(" Sunroof,");
        }

        return stringBuilder.toString();
    }

    @Override
    public int getCost() {
        return cost;
    }
}
