package com.abdullahalger;

/**
 * Created by Abdullah-Mac on 2/3/16.
 */
public class Printer {

    private int toner;
    private boolean duplexPrinter;
    private int pagesPrinted;

    public Printer(int toner, boolean duplexPrinter) {
        if (toner > -1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public void print(int pages) {
        System.out.println("Printing " + printPages(pages) + " pages");
    }

    private int printPages(int pages) {
        System.out.println("Printing ...");
        int numberOfPages = 0;
        if (this.duplexPrinter) {
            if (tonerLevel() < Math.round(pages / 2f)) {
                System.out.println("Sorry, but you don't have toner to print");
            } else {
                System.out.println("This is a duplex printer ...");
                numberOfPages += Math.round(pages / 2f);
            }
        } else {
            if (tonerLevel() < pages) {
                System.out.println("Sorry, but you don't have toner to print");
            } else {
                numberOfPages += pages;
            }
        }
        this.toner = this.toner - numberOfPages;
        this.pagesPrinted += numberOfPages;
        return numberOfPages;
    }

    public int fillToner(int ink) {
        System.out.println("Adding Ink");
        if (ink > 0 && ink <= 100) {
            if (this.toner + ink > 100) {
                return -1;
            }
            this.toner += ink;
            return this.toner;
        } else {
            return -1;
        }
    }

    public int tonerLevel() {
        return toner;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
