package com.eli.chemistry;

import com.eli.chemistry.enums.ElementoQuimico;
import com.sun.org.apache.bcel.internal.ExceptionConstants;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        String miElemento ="bodrio";

        try {
            System.out.println(ElementoQuimico.getSimbolo(miElemento));
            System.out.println(ElementoQuimico.getNumeroAtomico(miElemento));
            System.out.println(ElementoQuimico.getSerieQuimica(miElemento));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
