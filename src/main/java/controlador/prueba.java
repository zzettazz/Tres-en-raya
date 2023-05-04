package controlador;

public class prueba
{
    public static void main(String[] args)
    {
        double aleatorio = Math.random()*10;
        boolean booleano = false;
        if (aleatorio > 5) booleano = true;
        else if(aleatorio < 5) booleano = false;


        System.out.println(booleano);
    }
}
