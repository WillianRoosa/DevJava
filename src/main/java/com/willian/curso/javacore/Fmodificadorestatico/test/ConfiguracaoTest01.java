package com.willian.curso.javacore.Fmodificadorestatico.test;

import com.willian.curso.javacore.Fmodificadorestatico.dominio.Configuracao;
import com.willian.curso.javacore.Fmodificadorestatico.dominio.ImprimeConfiguracao;

public class ConfiguracaoTest01 {
    public static void main(String[] args) {
        Configuracao software = new Configuracao("Versão 1.0", "Produção");
        ImprimeConfiguracao impressora = new ImprimeConfiguracao();
        impressora.imprimeConfig(software);
    }
}
