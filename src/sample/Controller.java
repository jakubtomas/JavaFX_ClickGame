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
            decrease(0);

            if (array[0] != 0 ) {
                rise(1);
                rise(2);
            }
            // rise(3);

            // 1 2 3



        } else if (value == 1) {
            // 0 2 3
            decrease(1);


            if (array[1] != 0) {

                rise(0);
                // rise(2);
                rise(3);
            }

        }
        else if (value == 2 ) {
         // 0 1 3
            decrease(2);
            //rise(1);

            if (array[2] != 0 ) {

                rise(0);
                rise(3);
            }
        }
        else if ( value == 3 ) {

         //  0 1 2
            decrease(3);

            if (array[3] != 0) {
                rise(1);
                rise(2);
            }
            //rise(0);


        }
        setNumber();

        System.out.println("id " + value );

    }


    public void Start(ActionEvent event) {

    // generate 4 numbers


        for (int i = 0; i <array.length ; i++) {
            Random rnd = new Random();
            int low = 5;
            int high = 10;
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

    private void rise ( int position ) {
        /*boolean permission = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                permission = false;
                break;
            }
        }
        //check array than we dont have value 0
        if (permission) {
            array[position] = array[position] + 1;

        }*/

        array[position] = array[position] + 1;
/*
        if (array[position] != 0) {
        } else {
            System.out.println("button is 0 ");

        }*/

    }

    private void decrease( int position ) {
        // must check value from array isnt zero

        if (array[position] != 0) {
            array[position] = array[position] - 1;
        } else {
            System.out.println(" value 0 ");
        }

    }



    private void setNumber() {
        btn0.setText(String.valueOf(array[0]));
        btn1.setText(String.valueOf(array[1]));
        btn2.setText(String.valueOf(array[2]));
        btn3.setText(String.valueOf(array[3]));

    }
}
