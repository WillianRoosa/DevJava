package com.willian.curso.javacore.Csobrecargametodos.test;

import com.willian.curso.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 120, "Ação/Luta");
        anime.imprime();
    }
}
