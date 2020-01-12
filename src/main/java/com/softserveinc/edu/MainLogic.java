package com.softserveinc.edu;

import java.util.Scanner;

public class MainLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String responseFromUser;
       do {
           System.out.print("Input length the main envelope: ");
           double a = in.nextInt();
           System.out.print("Input width the main envelope: ");
           double b = in.nextInt();

           Envelope mainEnvelope = new Envelope(a, b);
           double squareResult1 = mainEnvelope.squareCalculating();

           System.out.print("Input length the nested envelope: ");
           double c = in.nextInt();
           System.out.print("Input width the nested envelope: ");
           double d = in.nextInt();

           Envelope nestedEnvelope = new Envelope(c, d);
           double squareResult2 = nestedEnvelope.squareCalculating();

           validateEnvelopes(squareResult1, squareResult2);

           System.out.print("\nIf you want to continue, please press y/yes. If you want stop, please press n/no: ");
           responseFromUser = in.next();
       }
       while(responseFromUser.toLowerCase().equals("y") || responseFromUser.toLowerCase().equals("yes"));

    }

    public static void validateEnvelopes(double square1, double square2){
        if(square2 < square1)
            System.out.print("The second envelope can be nested to the first");
        else
            System.out.print("Can't nested the second envelope to the first due to the second envelope is larger than the first");
    }
}

class Envelope{
    double width;
    double length;

    Envelope(double w, double l){
        width = w;
        length = l;
    }

    public double squareCalculating(){
       return this.width * this.length;
    }
}