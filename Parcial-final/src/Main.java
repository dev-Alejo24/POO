public class Main {
    public static void main(String[] args) {

        SistemaAeropuerto sistema = new SistemaAeropuerto();

        // Creando objetos Aeropuerto
        Aeropuerto aeropuerto1 = new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1);
        Aeropuerto aeropuerto2 = new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1);
        Aeropuerto aeropuerto3 = new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", 1);
        Aeropuerto aeropuerto4 = new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", 0);
        Aeropuerto aeropuerto5 = new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", -3);

        //agrega los aeropuertos a las lista de sistema
        sistema.addAeropuerto(aeropuerto1);
        sistema.addAeropuerto(aeropuerto2);
        sistema.addAeropuerto(aeropuerto3);
        sistema.addAeropuerto(aeropuerto4);
        sistema.addAeropuerto(aeropuerto5);

        // Creando objetos VueloRegular
        Vuelo vuelo1 = new VueloReg("BCN01", "MAD01", "01:00", "Iberia", "Airbus", 150, "L-15:00 X-15:00 V-15:00 D-15:00", "-");
        Vuelo vuelo2 = new VueloReg("MAD01", "BCN01", "01:00", "Iberia", "Airbus", 150, "L-18:00 J-20:00 S-20:00", "-");
        Vuelo vuelo3 = new VueloReg("BCN01", "LON01", "01:05", "British Air", "Boeing", 180, "L-10:00 J-10:00", "-");
        Vuelo vuelo4 = new VueloReg("LON01", "BCN01","01:05","British Air","Boeing",180, "L-15:00 J-15:00","-");
        Vuelo vuelo5 = new VueloReg("BCN01", "LON01","01:10","Ryan Air","Airbus",120, "L-10:00 J-10:00","-");
        Vuelo vuelo6 = new VueloReg("LON01", "BCN01","01:10","Ryan Air","Airbus",120, "J-15:10 J-15:10","-");
        Vuelo vuelo7 = new VueloReg("LON01", "SPA01","07:00","British Air","Boeing",200, "X-09:45 J-09:45 S-09:45","-");
        Vuelo vuelo8 = new VueloReg("SPA01", "MAD01","07:00","British Air","Boeing",200, "X-20:25 J-20:25 S-20:25","-");

        //vuelos VueloChartar
        Vuelo vuelo9 = new VueloChar("BCN01", "MAD01", "01:00", "Spanair", "Airbus", 150, "Viajes Condor", "1/2009/15 20:30");
        Vuelo vuelo10 = new VueloChar("BCN01", "MAD01", "01:00", "Spanair", "Airbus",150,"Viajes Condor","1/2009/15 20:30");
        Vuelo vuelo11 = new VueloChar("MAD01", "BCN01", "01:00", "Iberia", "Airbus", 150, "Viajes Condor", "1/2009/22 20:30");
        Vuelo vuelo12 = new VueloChar("BCN01", "LON01", "01:00", "British Air", "Boeing", 180, "Viaje Ilusion", "2/2009/22 20:30");
        Vuelo vuelo13 = new VueloChar("LON01", "BCN01", "01:00", "British Air", "Boeing", 180, "Viaje Ilusion", "3/2009/05 15:19");
        Vuelo vuelo14 = new VueloChar("LON01", "BCN01", "01:00", "British Air", "Boeing" , 180, "Viaje Ilusion", "3/2009/05 15:19");
        Vuelo vuelo15 = new VueloChar("BCN01", "LON01", "01:00", "Ryan Air", "Airbus", 120, "TravelPlan", "1/2009/25 15:18");
        Vuelo vuelo16 = new VueloChar("SPA01", "SPA01", "01:00", "Ryan Air", "Airbus", 120, "TravelPlan", "1/2009/31 22:20");
        Vuelo vuelo17 = new VueloChar("SIB01", "SPA01", "01:00", "Ryan Air", "Airbus", 120, "TravelPlan", "1/2009/31 22:20");

        //agrega los vuelos a la lista de sistema
        sistema.addVuelo(vuelo1);
        sistema.addVuelo(vuelo2);
        sistema.addVuelo(vuelo3);
        sistema.addVuelo(vuelo4);
        sistema.addVuelo(vuelo5);
        sistema.addVuelo(vuelo6);
        sistema.addVuelo(vuelo7);
        sistema.addVuelo(vuelo8);
        sistema.addVuelo(vuelo9);
        sistema.addVuelo(vuelo10);
        sistema.addVuelo(vuelo11);
        sistema.addVuelo(vuelo12);
        sistema.addVuelo(vuelo13);
        sistema.addVuelo(vuelo14);
        sistema.addVuelo(vuelo15);
        sistema.addVuelo(vuelo16);
        sistema.addVuelo(vuelo17);

        // Imprimir todos los aeropuertos y vuelos
        sistema.imprimirAeropuerto();
        sistema.imprimirVuelos();

        //mostrar si el vuelo va de salida o llegada
        sistema.imprimirVuelosSalida();
        sistema.imprimirVuelosLlegada();

    }
}
