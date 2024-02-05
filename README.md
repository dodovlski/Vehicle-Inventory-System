# Vehicle Inventory Application

This Java program symbolizes a vehicle inventory application. The program includes classes representing cars and motorcycles, which are added to an inventory object for storage.

## Usage

1. **Creating an Inventory Object**

    ```java
    Inventory inventory = new Inventory();
    ```

2. **Adding a Sivic Car**

    ```java
    Car car = new Sivic();
    car.setAbs(true);
    car.setMusicSystem(true);
    car.setAirBag(true);
    inventory.add(car);
    ```

3. **Adding another Sivic Car**

    ```java
    car = new Sivic();
    car.setAbs(true);
    car.setSunRoof(true);
    inventory.add(car);
    ```

4. **Adding a Sity Car**

    ```java
    car = new Sity();
    car.setMusicSystem(true);
    car.setSunRoof(true);
    inventory.add(car);
    ```

5. **Adding a Racer Motorcycle**

    ```java
    Motorbike mBike = new Racer();
    mBike.setAbs(true);
    mBike.setSeatHeating(true);
    inventory.add(mBike);
    ```

6. **Adding a Scooter Motorcycle**

    ```java
    mBike = new Scooter();
    mBike.setSeatHeating(true);
    inventory.add(mBike);
    ```

7. **Printing the Inventory**

    ```java
    System.out.println(inventory);
    ```

## Style

Style files should be named `style.css`. Below is an example CSS code:

```css
body {
    font-family: 'Arial', sans-serif;
    margin: 20px;
}

code {
    background-color: #f4f4f4;
    border: 1px solid #ddd;
    padding: 5px;
    display: block;
    overflow-x: auto;
    margin: 10px 0;
}
