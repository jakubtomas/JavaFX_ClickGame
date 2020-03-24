package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {

    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;


    int[] array = new int[4];
    // array must be public maybe

    public void clickBtn(ActionEvent event) {

        System.out.println("button " + ((Button) event.getSource()).getId());// id number ale je to String

        String id = (((Button) event.getSource()).getId().substring(3));// change  to int from string




        int value = Integer.parseInt(id);


        if (value == 0) {
            // 1 2 3
        } else if (value == 1) {
        }
        else if (value == 2 ) {
        }
        else if ( value == 3 ) {
        }

        System.out.println("id " + value );

    }


    public void Start(ActionEvent event) {

    // generate 4 numbers


        for (int i = 0; i <array.length ; i++) {
            Random rnd = new Random();
            int low = 5;
            int high = 15;
            int rndNumber = rnd.nextInt(high-low) + low;

            array[i] = rndNumber;

            System.out.println("gener number" + rndNumber);

        }

        System.out.println("==============");

        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }

        setNumber();
        // create array and set values into buttons
    }


    private void setNumber() {
        btn0.setText(String.valueOf(array[0]));
        btn1.setText(String.valueOf(array[1]));
        btn2.setText(String.valueOf(array[2]));
        btn3.setText(String.valueOf(array[3]));


    }
}
