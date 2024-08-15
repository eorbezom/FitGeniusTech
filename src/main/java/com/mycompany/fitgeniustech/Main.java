package com.mycompany.fitgeniustech;

import com.mycompany.fitgeniustech.interfaz.Principal;

public class Main {
    public static void main(String[] args) {
        Principal interfazpPrincipal = new Principal();
        interfazpPrincipal.setVisible(true);
        interfazpPrincipal.setLocationRelativeTo(interfazpPrincipal);
    }
}