package com.company;


public class PizzaFactory {

    public static final String MUZZARELLA = "MUZZARELLA";
    public static final String ESPECIAL = "ESPECIAL";
    public static final String ANANA = "ANANA";
    public static final String COMBINADA = "COMBINADA";
    public static final String TROPICAL = "TROPICAL";



    private static PizzaFactory instance;

    private PizzaFactory(){}

    public static PizzaFactory getInstance(){

        if( instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigoPizza) throws PizzaFactoryException{

        switch (codigoPizza){
            case MUZZARELLA :
               return new PizzaSimple("Muzzarella", "pizza chica de muzarella", false, 700.0);
            case ESPECIAL :
                return new PizzaSimple("Especial", "pizza chica especial", false, 850.0);
            case ANANA :
                return new PizzaSimple("Anana", "pizza chica de anana", false, 950.0);
            case COMBINADA:{
                PizzaCombinada pizzaCombinadaLoca = new PizzaCombinada("Combinada", "especial + anana");
                pizzaCombinadaLoca.agregar(crearPizza("ESPECIAL"));
                pizzaCombinadaLoca.agregar(crearPizza("ANANA"));
                return pizzaCombinadaLoca;
            }
            case TROPICAL :
                return new PizzaSimple("Tropical", "frutos tropicales", true, 1000.0);
        }
        throw new PizzaFactoryException( codigoPizza + "Código inválido");
    }
}
