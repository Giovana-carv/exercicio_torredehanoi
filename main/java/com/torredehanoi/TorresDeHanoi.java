package com.torredehanoi;

public class TorresDeHanoi {
    long movimentos = 0;

    void resolver(int n, char origem, char destino, char auxiliar) {
        if (n == 0) return;
        resolver(n - 1, origem, auxiliar, destino);
        movimentos++;
        resolver(n - 1, auxiliar, destino, origem);
    }
}
